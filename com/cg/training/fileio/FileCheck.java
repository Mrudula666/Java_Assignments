/**
 * 
 */
package com.cg.training.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author mrnimmal
 *
 */
public class FileCheck {

	public boolean isFileExits(File f) {
		if(f.exists())
			return true;
		
		return false;
	}

	/**
	 * @param args
	 */
	


}
