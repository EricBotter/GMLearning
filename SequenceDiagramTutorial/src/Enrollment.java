
public class Enrollment {

	private Student _student;
	
	public Enrollment(Student student) {
		this._student = student;
	}

	public String getInfo() {
		return _student.getInfo();
	}
}
