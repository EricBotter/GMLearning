package refactoring.replacedelegationwithinheritance;

public class Employee {
	Person _person = new Person();
	
	public String getName() {
		return _person.getName();
	}
	
	public void setName(String name) {
		_person.setName(name);
	}
	
	@Override
	public String toString() {
		return "Emp: "+_person.getLastName();
	}
}
