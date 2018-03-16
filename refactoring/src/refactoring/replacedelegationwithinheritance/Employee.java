package refactoring.replacedelegationwithinheritance;

public class Employee extends Person {
	@Override
	public String toString() {
		return "Emp: " + getLastName();
	}
}
