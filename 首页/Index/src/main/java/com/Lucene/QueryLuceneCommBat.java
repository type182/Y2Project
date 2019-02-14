package com.Lucene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.queryparser.classic.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.Goods;

@Component
public class QueryLuceneCommBat {
	@Autowired
	DocumentUtil util;
	public List<LucentPojo> QueryName(String index,int lenght) throws IOException, ParseException{
		 List<Document> list = util.QueryDirectory(index,lenght);
		List<LucentPojo> lucentGoods = new ArrayList<>();
		 for (Document document : list) {
			 String id = document.get("id");
			 String name = document.get("name");
			 String content = document.get("content");
			 lucentGoods.add(new LucentPojo(id, name, content));
		}
		return lucentGoods;
	}
	
	public boolean SetIndex(List<Goods> list) {
		
		for (Goods goods : list) {
			LucentIndexPojo l1 = new LucentIndexPojo("id", goods.getId().toString(), Store.YES);
			LucentIndexPojo l2 = new LucentIndexPojo("name", goods.getItemname(), Store.YES);
			LucentIndexPojo l3 = new LucentIndexPojo("content", goods.getGoodsbrand(), Store.YES);
			boolean addLuceneDocument = util.AddLuceneDocument(l1,l2,l3);
			if (!addLuceneDocument) {
				return addLuceneDocument;
			}
		}
		return true;
	}
	
	
}
