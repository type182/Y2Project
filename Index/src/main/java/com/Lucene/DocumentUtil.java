package com.Lucene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.SimpleAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Collector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DocumentUtil {
	
	@Autowired
	Directory directory;
	
	public  List<Document> QueryDirectory(String content, int lenght) throws IOException, ParseException {
		IndexReader reader = DirectoryReader.open(directory);
		IndexSearcher searcher = new IndexSearcher(reader);
		Analyzer analyzer = new SimpleAnalyzer();
		QueryParser parser = new QueryParser("null",analyzer);
		Query parse = parser.parse(content);
		TopDocs search = searcher.search(parse, lenght);
		System.out.println("命中数量:"+search.totalHits);
		ScoreDoc[] scoreDocs = search.scoreDocs;
		List<Document> list =new ArrayList<Document>();
		for (int i = 0; i < scoreDocs.length; i++) {
			int doc = scoreDocs[i].doc;
			System.out.println("当前查询到的索引:"+doc);
			Document doc2 = searcher.doc(doc);
			list.add(doc2);
		}
		return list;
	}
	
	public boolean AddLuceneDocument(LucentIndexPojo...indexs){
		try {
			IndexWriterConfig writer = new IndexWriterConfig(new SimpleAnalyzer());
			IndexWriter writer2 = new IndexWriter(directory, writer);
			for (LucentIndexPojo index : indexs) {
				Document setDocument = SetDocument(new TextField(index.getKey(), index.getValue(), index.getStore()));
				writer2.addDocument(setDocument);
			
				
			}
			
			
			writer2.commit();
			writer2.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public Document SetDocument(IndexableField Index) {
		Document document = new Document();
		document.add(Index);
		return document;
	}
	
	
	
	
	
	
	
	
}
