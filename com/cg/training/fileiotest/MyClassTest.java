package com.cg.training.fileiotest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.fileio.EmployeeIO;
import com.cg.training.fileio.MyClass;

public class MyClassTest {
	private MyClass class1;
	private MyClass class2;
	private MyClass class3;
	private MyClass class4;
	private MyClass class5;
	ArrayList<MyClass> MyClassList;
	
	@Before
	public void setUp(){
		class1 = new MyClass(1,"History",34);
		class2 = new MyClass(2,"Biology",56);
		class3 = new MyClass(3,"Physics",67);
		class4 = new MyClass(4,"Mathematics",19);
		class5 = new MyClass(5,"Computer Science",69);
		MyClassList = new ArrayList<MyClass>();
		MyClassList.add(class1);
		MyClassList.add(class2);
		MyClassList.add(class3);
		MyClassList.add(class4);
		MyClassList.add(class5);
		
	}
	@Test
	public void testForWritingTheArrayListInFile() {
		String filePath = "C:/Users/mrnimmal/Downloads/ArrayList.ser";
		MyClass readArrayList = null;
		readArrayList.getWriteArrayList(MyClassList,filePath);
	}

}
