package refactoring.introduce_null_object;

public class BillingPlan {

	public static BillingPlan basic() {
		return new BillingPlan();
	}

}
