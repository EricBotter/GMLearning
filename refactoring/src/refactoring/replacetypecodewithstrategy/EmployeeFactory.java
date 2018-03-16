package refactoring.replacetypecodewithstrategy;

public class EmployeeFactory {
	static Employee newEngineer(int monthlySalary) {
		Engineer type = new Engineer();
		return new Employee(monthlySalary, type);
	}
	
	static Employee newSalesman(int monthlySalary, int commission) {
		Salesman type = new Salesman(commission);
		return new Employee(monthlySalary, type);
	}

	static Employee newManager(int monthlySalary, int bonus) {
		Manager  type = new Manager(bonus);
		return new Employee(monthlySalary, type);
	}
}
