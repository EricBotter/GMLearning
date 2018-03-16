package refactoring.introducenullobject;

public class PaymentHistory {
	private int _weeksDelinquentInLastYear;

	public int getWeeksDelinquentInLastYear() {
		return _weeksDelinquentInLastYear;
	}

	public static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}

}
