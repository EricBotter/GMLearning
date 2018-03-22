package refactoring.remove_setting_method;

public class InterestAccount extends Account {
	private final double _interestRate;
	
	public InterestAccount(String id, double rate) {
		setId(id);
		_interestRate = rate;
	}

	public double getInterestRate() {
		return _interestRate;
	}
}
