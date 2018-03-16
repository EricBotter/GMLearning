package refactoring.replacetypecodewithstrategy;

public class Employee {
    
    EmployeeType _type;
	int _monthlySalary;
	
	Employee (int monthlySalary, EmployeeType type) {
		_type = type;
		_monthlySalary = monthlySalary;
    }
    
    public int payAmount() {
    	return _type.payAmount(this);
    }

	public EmployeeType getType() {
		return _type;
	}
	
	public int getMonthlySalary() {
		return _monthlySalary;
	}
}
