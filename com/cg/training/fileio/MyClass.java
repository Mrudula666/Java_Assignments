package com.cg.training.fileio;

import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param id
	 * @param className
	 * @param noOfStudents
	 */
	private int id;
	private String className;
	private int noOfStudents;
	

	public MyClass(int id, String className, int noOfStudents) {
		this.id = id;
		this.className = className;
		this.noOfStudents = noOfStudents;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public int getNoOfStudents() {
		return noOfStudents;
	}


	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}


	@Override
	public String toString() {
		return "MyClass [id=" + id + ", className=" + className
				+ ", noOfStudents=" + noOfStudents + "]";
	}


	public void getWriteArrayList(ArrayList<MyClass> myClassList,
			String filePath) {
		
		
	}

}
