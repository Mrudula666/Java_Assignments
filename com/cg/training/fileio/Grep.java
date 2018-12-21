package com.cg.training.fileio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Grep {
	FileReader fr;
	BufferedReader br;

	public ArrayList<String> searchForWord(String word, String path) {
		ArrayList<String> result = new ArrayList<String>();
		try {
			fr = new FileReader(path);
			br  = new BufferedReader(fr);
			while(br.readLine() != null ){
					//result.add(br.readLine());
					System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	
	
}
