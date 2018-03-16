package refactoring.hidedelegate;

public class Person {
	private Department _department;

	public Person getManager() {
		return _department.getManager();
	}

	public void setDepartment(Department department) {
		_department = department;
	}
}
