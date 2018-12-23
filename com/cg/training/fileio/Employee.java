/**
 * 
 */
package com.cg.training.fileio;

import java.io.Serializable;

/**
 * @author mrnimmal
 *
 */
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param string
	 * @param d
	 */
	private int empId;
	private String empName;
	private double salary;
	private static int idGenerator;
	static{
		idGenerator = 166043;
	}
	{
		empId = ++idGenerator;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
		
	}

	

}
