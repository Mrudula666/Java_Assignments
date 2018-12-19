package corejava.day3assignments;

public class PaymentGateway {
	public static boolean transfer(BankAccount sender,
			BankAccount receiver, double amount) {
		boolean flag =false;
		if ( sender.getInitialBalance()>=amount){
			flag =true;
			sender.depositAmount(-amount);
			receiver.depositAmount(amount);
		}
		return flag;
	}
	

}
