package com.Lucene;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LucenePage {
	@Value("${com.maimai.Lucene.PATH}")
	String PATH;
	
	@Bean
	public Directory getLuceneDirectory() throws IOException {
		return FSDirectory.open(Paths.get(PATH));
	}
	
	
	
}
