package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.WordCount;

public class WordCountTest {
	WordCount wordCount;
	
	@Before 
	public void setUp(){
		wordCount = new WordCount();
	}

	@Test
	public void testforWordCountinGivenFile() {
		try {
			int wordCountInFile = wordCount.getWordCount("C:/Users/mrnimmal/Downloads/test.txt");
			System.out.println(wordCountInFile);
			assertEquals(8,wordCountInFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
