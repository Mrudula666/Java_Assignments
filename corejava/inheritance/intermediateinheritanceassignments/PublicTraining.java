package corejava.inheritance.intermediateinheritanceassignments;

import corejava.inheritance.assignments.exceptions.InvalidAmountException;
import corejava.inheritance.assignments.exceptions.InvalidNumberOfPersonsException;

public class PublicTraining extends Training {
	
	private int noOfParticipants;
	
	/**
	 * 
	 * @param subject
	 * @param fees
	 * @param noOfParticipants
	 */

	public PublicTraining(String subject, double fees, int noOfParticipants) {
		super(subject, fees);
		this.noOfParticipants = noOfParticipants;
	}

	@Override
	public double getOrderValue() throws InvalidAmountException, InvalidNumberOfPersonsException {
		if( fees >= 0  && noOfParticipants > 0)
		return ( fees * noOfParticipants);
		else if ( fees <= 0){
			throw new InvalidAmountException( "Invalid Amount");
		}else
			throw new InvalidNumberOfPersonsException( "Invalid number of persons ");
	}

}
