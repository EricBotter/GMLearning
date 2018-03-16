package refactoring.replace_type_code_with_subclasses;

public class Manager extends Employee {

	@Override
	public int getType() {
		return Employee.MANAGER;
	}
}
