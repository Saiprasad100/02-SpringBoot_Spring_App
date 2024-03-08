package in.ashokit.beans;

public class PaymentService {
 
	private IPayment payment;
 
 public PaymentService ()
 {
	 System.out.println("PaymentService ::0- Contructor");
 }
 
 public PaymentService (IPayment payment) {
	System.out.println("PaymentService ::Param- Contructor");
	 this.payment=payment;
 }
 public void setPayment(IPayment payment ) {
	 System.out.println("Seter method is Called...");
	this.payment=payment;
}
 public void doPayment(double billAmt) {
	boolean status = payment.ProcessPayment(billAmt);
	 if(status) {
		 System.out.println("Reciept Printing...");
	 }
	 else {
		System.out.println("Card Declined...");
	}
 }
  
}
