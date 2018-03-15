package refactoring.replacetypecodewithclass;

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
