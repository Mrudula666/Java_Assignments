package corejava.inheritance.intermediateinheritanceassignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.inheritance.assignments.exceptions.InvalidAmountException;
import corejava.inheritance.assignments.exceptions.InvalidNumberOfPersonsException;
import corejava.inheritance.intermediateinheritanceassignments.CorporateTraining;
import corejava.inheritance.intermediateinheritanceassignments.PublicTraining;
import corejava.inheritance.intermediateinheritanceassignments.Training;

public class TrainingTest {
	//creating the reference names for the Training super class  to upcast the sub classes.
	private Training publicTraining;
	private Training corporateTraining;
	
	//creating the instances of the public and corporate sub classes
	@Before
	public void setUp(){
		publicTraining = new PublicTraining ( "Java", 5000.0, -50);
		corporateTraining = new CorporateTraining ( "Big Data", 35000.0, 4);
		
	}
	
	@Test
	public void testForPublicTrainingCost(){
		double getCostOfTraining;
		try {
			getCostOfTraining = publicTraining.getOrderValue();
			System.out.println(getCostOfTraining);
			assertEquals(250000.0, getCostOfTraining,0.0);
		} catch (InvalidAmountException | InvalidNumberOfPersonsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
	
	
	@Test
	public void testForCorporateTrainingCost(){
		double getCostOfTraining;
		try {
			getCostOfTraining = corporateTraining.getOrderValue();
			System.out.println(getCostOfTraining);
		} catch (InvalidAmountException | InvalidNumberOfPersonsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	@Test
	public void testForInvalidFees(){
		double getCostOfTraining;
		try {
			getCostOfTraining = publicTraining.getOrderValue();
			System.out.println(getCostOfTraining);
			assertEquals(250000.0, getCostOfTraining,0.0);
		} catch (InvalidAmountException | InvalidNumberOfPersonsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testForInvalidNumberOfParticipants(){
		double getCostOfTraining;
		try {
			getCostOfTraining = publicTraining.getOrderValue();
			System.out.println(getCostOfTraining);
			assertEquals(250000.0, getCostOfTraining,0.0);
		} catch (InvalidAmountException | InvalidNumberOfPersonsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
