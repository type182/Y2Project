package com.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;

public class DataTest {

	@Test
	public void test() {
	
	}
	
	
	@Test
	public void SetRedisText() throws IOException{
//		//1 创建文件对象
//				Document doc=new Document();
//				//模拟一条商品表格中的数据进行doc的封装
//				//536563	阿尔卡特 (OT-927) 炭黑 联通3G手机 双卡双待	清仓！仅北京，武汉仓有货！	299000	99999	\N	http://image.jt.com/jd/4ef8861cf6854de9889f3db9b24dc371.jpg	560	1	2015-03-08 21:33:18	2015-03-08 21:33:18
//				doc.add(new TextField("id","536563l",Store.YES));//field对象是lucene的类型,对应string,Integer
//				//对于每一个doc对象不同的字段内容都有对应的名称,Store.YES表示当前
//				//索引文件中每一个文章对象保存与否
//				doc.add(new TextField("title",
//						"阿尔卡特 (OT-927) 炭黑 联通3G手机 双卡双待",
//						Store.YES));
//				doc.add(new TextField("sellPoint",
//						"清仓！仅北京，武汉仓有货！",Store.YES));
//				doc.add(new TextField("price","299000l",Store.YES));
//				doc.add(new StringField("image",
//						"http://image.jt.com/",Store.YES));
//				//2 创建索引,引入分词
//				//做一个文件夹保存索引文件
//				Directory dir=FSDirectory.open(Paths.get("E:\\Lucene\\Text"));
//				//引入分词器对象,对当前doc内的所有数据进行分词处理
//				Analyzer analyzer=new StandardAnalyzer();
//				//Analyzer analyzer=new ChineseAnalyzer();
//				//Analyzer analyzer=null;
//				//创建输出流writer
//				IndexWriterConfig config=
//			new IndexWriterConfig();
//				IndexWriter writer=new IndexWriter(dir,config);
//				//创建对应上面的doc对象的索引文件
//				writer.addDocument(doc);
//				//释放资源
//				writer.close();
//				dir.close();
//	
	}

}
