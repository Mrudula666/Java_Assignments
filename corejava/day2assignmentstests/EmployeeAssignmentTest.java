package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Employee_Assignment;

public class EmployeeAssignmentTest {
	Employee_Assignment employee;
	@Before
	 public void setUp(){
		employee = new Employee_Assignment(166044,"Mrudulaa",15000);
	}
	
	@Test
	public void testForsettingId() {
		int expectedId = 102;
		employee.setId(102);
		int id = employee.getId();
		assertEquals(expectedId, id);
	}
	
	@Test
	public void testForsettingName() {
		String expectedName = "Bharghavi";
		employee.setName("Bharghavi");
		String name = employee.getName();
		assertEquals(expectedName, name);
	}
	
	@Test
	public void testForsettingMonthlyBasic() {
		double expectedMonthlyBasic = 20000.0;
		employee.setMonthlyBasic(20000);
		double monthlyBasic = employee.getMonthlyBasic();
		assertEquals(expectedMonthlyBasic, monthlyBasic, 2);
	}

	@Test
	public void testForPfRate() {
		int expectedpfRate = 10;
		Employee_Assignment.setPfRate(10);
		int pfRate = Employee_Assignment.getPfRate();
		assertEquals(expectedpfRate, pfRate);
	}
	
	@Test
	public void testForAnnualBasic() {
		double expectedAnnualBasic = 180000.0;
		double annualBasic = employee.getAnnualBasic();
		assertEquals(expectedAnnualBasic, annualBasic,2);
	}
	
	@Test
	public void testForMonthlyGrossSalary() {
		double expectedSalary = 17050.0;
		double monthlyGrossSalary = employee.getMonthlyGrossSalary();
		assertEquals(expectedSalary, monthlyGrossSalary,2);
	}
	
	@Test
	public void testForAnnualSalary() {
		double expectedAnnualSalary = 204600.0;
		double annualGrossSalary = employee.getAnnualGrossSalary();
		assertEquals(expectedAnnualSalary, annualGrossSalary,2);
	}
	
	@Test
	public void testForMonthlyDeduction() {
		double expectedmonthlyDeductions = 6600;
		double monthlyDeductions = employee.getMonthlyDeductions();
		assertEquals(expectedmonthlyDeductions, monthlyDeductions,2);
	}
	@Test
	public void testforMonthlyTakeHome() {
		double expectedMonthlyTakeHome = 10450.0;
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		assertEquals(expectedMonthlyTakeHome, monthlyTakeHome,2);
	}
	
	@Test
	public void testforAnnualTakeHome() {
		double expectedAnnualTakeHome = 125400.0;
		double annualTakeHome = employee.getAnnualTakeHome();
		assertEquals(expectedAnnualTakeHome, annualTakeHome,2);
	}
	

}
