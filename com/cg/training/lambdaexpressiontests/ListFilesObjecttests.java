package com.cg.training.lambdaexpressiontests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileFilter;

import org.junit.Test;

public class ListFilesObjecttests {
	File fileName1 = null;
	File fileName2;

	@Test
	public void test() {
		
		fileName1 = new File("C:\\Users\\mrnimmal\\Downloads\\file1.txt");
		//fileName2 = new File("C:\\Users\\mrnimmal\\Downloads\\file2.txt");
		File[] paths = new File[5];
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File arg0) {
				return arg0.isFile();
			}
		};
		 paths = fileName1.listFiles(filter);
		 for (File file : paths) {
			System.out.println(file);
		}
		
	}

}
