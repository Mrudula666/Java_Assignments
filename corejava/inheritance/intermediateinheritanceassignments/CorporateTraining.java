package corejava.inheritance.intermediateinheritanceassignments;

public class CorporateTraining extends Training {
	private int days;
	/**
	 * 
	 * @param subject
	 * @param fees
	 * @param days
	 * 
	 * 
	 */
	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days = days;
	}
	/**
	 * Overridden method from super class.
	 */

	@Override
	public double getOrderValue() {
		return ( fees * days );
	}

}
