
public class Student {

	private String _name, _surname;

    public Student(String name, String surname) {
        _name = name;
        _surname = surname;
    }

	public String getInfo() {
		return getFullName();
	}

	private String getFullName() {
		return _name + " " + _surname;
	}
}
