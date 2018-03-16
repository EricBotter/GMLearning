package refactoring.introduce_null_object;

public class NullCustomer extends Customer {
	@Override
	public boolean isNull() {
		return true;
	}
	
	@Override
	public String getName() {
		return "occupant";
	}
	
	@Override
	public BillingPlan getBillingPlan() {
		return BillingPlan.basic();
	}
	
	@Override
	public PaymentHistory getPaymentHistory() {
		return PaymentHistory.newNull();
	}
}
