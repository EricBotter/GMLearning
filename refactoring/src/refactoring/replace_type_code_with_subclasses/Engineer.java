package refactoring.replace_type_code_with_subclasses;

public class Engineer extends Employee {
	
	@Override
	public int getType() {
		return Employee.ENGINEER;
	};
}
