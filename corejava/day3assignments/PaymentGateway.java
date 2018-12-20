package corejava.day3assignments;

import corejava.inheritance.assignments.exceptions.InvalidAmountException;

public class PaymentGateway {
	public static boolean transfer(BankAccount sender,
			BankAccount receiver, double amount) throws InvalidAmountException {
		boolean flag =false;
		if ( sender.getInitialBalance()>=amount){
			flag =true;
			sender.depositAmount(-amount);
			receiver.depositAmount(amount);
		}
		return flag;
	}
	

}
