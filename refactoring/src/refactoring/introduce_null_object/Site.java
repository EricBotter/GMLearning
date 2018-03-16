package refactoring.introduce_null_object;

public class Site {
	Customer _customer;
	
	Customer getCustomer() {
		return _customer == null ? Customer.newNull() : _customer;
	}
	
	public static void main(String[] args) {
		Site site = new Site();
		
		Customer customer = site.getCustomer();
		
		BillingPlan plan = customer.getBillingPlan();
		String customerName = customer.getName();
		int weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
		
		System.out.println(plan);
		System.out.println(customerName);
		System.out.println(weeksDelinquent);
	}
}
