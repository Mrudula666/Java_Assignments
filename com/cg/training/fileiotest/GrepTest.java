package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.Grep;

public class GrepTest {
	private Grep grep;
	
	@Before
	public void setUp(){
		grep = new Grep();
		
	}

	@Test
	public void testForSearching() {
		String path = "C:/Users/mrnimmal/Downloads/Mrudulaa.txt";
		ArrayList<String> result = grep.searchForWord("A",path);
		for (String line : result) {
			System.out.println(line);
			
		}
	}

}
