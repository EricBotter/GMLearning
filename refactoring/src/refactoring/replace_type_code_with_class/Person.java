package refactoring.replace_type_code_with_class;

public class Person {
	
	private BloodGroup _bloodGroup;
	
	public Person(BloodGroup bloodGroup) {
		setBloodGroup(bloodGroup);
	}

	public BloodGroup getBloodGroup() {
		return _bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		_bloodGroup = bloodGroup;
	}
}
