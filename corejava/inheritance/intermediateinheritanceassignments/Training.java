/**
 * 
 */
package corejava.inheritance.intermediateinheritanceassignments;

import corejava.inheritance.assignments.exceptions.InvalidAmountException;
import corejava.inheritance.assignments.exceptions.InvalidNumberOfPersonsException;

/**
 * Mrudula Nimmala
 * 
 * Creating a super class for training. 
 *
 */
public abstract class Training {
	private  int id;
	private static int idGenerator;
	private String subject;
	protected double fees;
	/**
	 * intializers for id that should be common for all the trainees.
	 */
	static{
		idGenerator = 100;
	}
	{
		id = ++idGenerator;
	}
	public Training(String subject, double fees) {
		super();
		this.subject = subject;
		this.fees = fees;
	}
	
	/**
	 * 
	 * @return 
	 * 
	 *  getOrderValue() is abstract as it is used in both the sub class of Training class.
	 * @throws InvalidAmountException 
	 * @throws InvalidNumberOfPersonsException 
	 */
	public abstract double getOrderValue() throws InvalidAmountException, InvalidNumberOfPersonsException;
}
