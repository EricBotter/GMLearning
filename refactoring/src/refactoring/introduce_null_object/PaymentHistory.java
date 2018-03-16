package refactoring.introduce_null_object;

public class PaymentHistory {
	private int _weeksDelinquentInLastYear;

	public int getWeeksDelinquentInLastYear() {
		return _weeksDelinquentInLastYear;
	}

	public static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}

}
