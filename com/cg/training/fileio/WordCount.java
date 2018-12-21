/**
 * 
 */
package com.cg.training.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mrnimmal
 *
 */
public class WordCount {
	FileReader fr;
	BufferedReader br;
	public int getWordCount(String path) throws IOException {
		int wordCount = 0;
		try {
			String s;
			fr = new FileReader(path);
			br  = new BufferedReader(fr);
			while((s = br.readLine()) != null){
				String line =s;
			String parts[] = s.split(" ");
			wordCount += parts.length;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fr.close();
			br.close();
		}
		return wordCount;
	}

}
