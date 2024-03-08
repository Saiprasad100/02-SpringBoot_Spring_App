package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
 
	
	public  CreditCardPayment() {
		
		System.out.println("Credit Card Payment:: Constructor");
	}
	
	public boolean ProcessPayment(double billAmt) {
		
		//logic
		System.out.println("Credit Card Payment Successfully...");
		return true;
 }
}
