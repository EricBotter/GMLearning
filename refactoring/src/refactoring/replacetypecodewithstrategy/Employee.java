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
	
	public static Employee newEngineer(int monthlySalary) {
		Engineer type = new Engineer();
		return new Employee(monthlySalary, type);
	}
	
	public static Employee newSalesman(int monthlySalary, int commission) {
		Salesman type = new Salesman(commission);
		return new Employee(monthlySalary, type);
	}

	public static Employee newManager(int monthlySalary, int bonus) {
		Manager  type = new Manager(bonus);
		return new Employee(monthlySalary, type);
	}
}
