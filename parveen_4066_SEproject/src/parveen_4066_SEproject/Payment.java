package parveen_4066_SEproject;

public class Payment {

	int payment_id,payment_amount;
	String payment_theatre;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
	}
	public String getPayment_theatre() {
		return payment_theatre;
	}
	public void setPayment_theatre(String payment_theatre) {
		this.payment_theatre = payment_theatre;
	}
	public Payment(int payment_id, int payment_amount, String payment_theatre) {
		super();
		this.payment_id = payment_id;
		this.payment_amount = payment_amount;
		this.payment_theatre = payment_theatre;
	}
	
	

}
