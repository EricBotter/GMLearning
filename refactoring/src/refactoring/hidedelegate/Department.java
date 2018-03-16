package refactoring.hidedelegate;

public class Department {
	private String _chargeCode;
	private final Person _manager;
	
	public Department(Person manager) {
		_manager = manager;
	}
	
	public Person getManager() {
		return _manager;
	}
	
	public String getChargeCode() {
		return _chargeCode;
	}
}
