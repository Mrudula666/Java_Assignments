package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.Employee;
import com.cg.training.fileio.EmployeeIO;

public class EmployeeSerialisationAndDeserialisation {
	private Employee employee;
	private EmployeeIO readEmployee;
	Employee newEmployee;
	
	@Before 
	public void setUp(){
		employee = new Employee("Mrudula",15000.0);
		readEmployee = new EmployeeIO();
	}
	@Test
	public void tesForReadingTheObject(){
		final String path = "C:/Users/mrnimmal/Downloads/test.txt";
		try {
			Employee readObject = readEmployee.getReadEmployeeObject(path);
			/*Reader fis = new FileReader(path);
			BufferedReader br = new BufferedReader(fis);
			while(br.readLine() != null){
				System.out.println(br.readLine());
			}*/
			PrintWriter pr = new PrintWriter(path);
			
			System.out.println(pr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void tesForWritingTheObject(){
		String filePath = "C:/Users/mrnimmal/Downloads/test.txt";
			try {
				readEmployee.getWriteEmployeeObject(employee,filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}
