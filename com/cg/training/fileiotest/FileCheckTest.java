
package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.FileCheck;

public class FileCheckTest {
	FileCheck fc;
	@Before 
	public void setUp(){
	 fc = new FileCheck();
		
	}

	@Test
	public void testForNoFile() {
		File f = new File("Mrudula.txt");
		boolean flag = fc.isFileExits(f);
		assertFalse(flag);
	}
	@Test
	public void testForFileFound() {
		File f = new File("C:/Users/mrnimmal/Downloads/datetime.txt");
		boolean flag = fc.isFileExits(f);
		assertTrue(flag);
		}

}
