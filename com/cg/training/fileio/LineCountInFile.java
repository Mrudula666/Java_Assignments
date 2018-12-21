 package com.cg.training.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LineCountInFile {
	FileReader fr;
	BufferedReader br;

	public int getLineCount(String path) throws IOException {
		int count =0;
		try {
			fr = new FileReader(path);
			br  = new BufferedReader(fr);
			while(br.readLine() != null ){
				count++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fr.close();
			br.close();
		}
		return count;
		
	}
	
	
	

}
