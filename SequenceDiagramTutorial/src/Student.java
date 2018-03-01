
public class Student {

	private String name, surname;
	
	public String getInfo() {
		return getFullName();
	}
	
	private String getFullName() {
		return name + surname;
	}
}
