package refactoring.replacetypecodewithsubclasses;

public class Manager extends Employee {

	@Override
	public int getType() {
		return Employee.MANAGER;
	}
}
