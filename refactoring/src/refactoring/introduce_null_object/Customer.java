package refactoring.introduce_null_object;

public class Customer {
	String _name;
	BillingPlan _billingPlan;
	PaymentHistory _paymentHistory;
	
	public String getName() {
		return _name;
	}
	
	public BillingPlan getBillingPlan() {
		return _billingPlan;
	}
	
	public PaymentHistory getPaymentHistory() {
		return _paymentHistory;
	}
	
	public boolean isNull() {
		return false;
	}
	
	public static Customer newNull() {
		return new NullCustomer();
	}
}
