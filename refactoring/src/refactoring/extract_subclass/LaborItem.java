package refactoring.extract_subclass;

public class LaborItem extends JobItem {
	
	private final Employee _employee;

	public LaborItem(int quantity, Employee employee) {
		super(quantity);
		_employee = employee;
	}

	public Employee getEmployee() {
		return _employee;
	}
	
	@Override
	public int getUnitPrice() {
		return _employee.getRate();
	}
	
	@Override
	public boolean isLabor() {
		return false;
	}

}
