package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.LineCountInFile;

public class LineCountInFileCheck {
	LineCountInFile lineCount;
	@Before 
	public void setUp(){
		lineCount = new LineCountInFile();
	}

	@Test
	public void testForNumberOfLines() {
		try {
			int totalCount = lineCount.getLineCount("C:/Users/mrnimmal/Downloads/datetime.txt");
			assertEquals(63, totalCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
