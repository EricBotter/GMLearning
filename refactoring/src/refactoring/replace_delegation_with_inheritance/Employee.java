package refactoring.replace_delegation_with_inheritance;

public class Employee extends Person {
	@Override
	public String toString() {
		return "Emp: " + getLastName();
	}
}
