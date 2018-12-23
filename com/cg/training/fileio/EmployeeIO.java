package com.cg.training.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeIO {

	public Employee getReadEmployeeObject(String path) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee readEmployee = null;
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			readEmployee = (Employee)ois.readObject();
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readEmployee;
	}

	public void getWriteEmployeeObject(Employee employee , String filePath) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos= null;
		Employee writeObject = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			

		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
