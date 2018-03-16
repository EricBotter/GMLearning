package refactoring.replacedelegationwithinheritance;

public class Person {
	private String _name;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}
	
	public String getLastName() {
		return _name.substring(_name.lastIndexOf(' ') + 1);
	}
}
