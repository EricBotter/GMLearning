package refactoring.extract_subclass;

public class Employee {

	private final int _rate;

	public Employee(int rate) {
		_rate = rate;
	}
	
	public int getRate() {
		return _rate;
	}

}
