package refactoring.introduce_null_object;

public class NullPaymentHistory extends PaymentHistory {

	@Override
	public int getWeeksDelinquentInLastYear() {
		return 0;
	}
}
