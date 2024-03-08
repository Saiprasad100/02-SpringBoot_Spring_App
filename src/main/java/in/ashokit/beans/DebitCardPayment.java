package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	
public  DebitCardPayment() {
		
		System.out.println("Debit Card Payment:: Constructor");
	}
	public boolean ProcessPayment(double billAmt) {
		
		//logic
		System.out.println("Debit Card Payment Successfully...");
		return true;
	}
}
