import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seminar {

	private final Course _course;
	private final List<Enrollment> _enrollments;

	private String _location;
	private int _seatsLeft;

	public Seminar(Course course) {
		_course = course;
		_enrollments = new ArrayList<>();
	}

	public Course getCourse() {
		return _course;
	}
	
	public String getName() {
		return _course.getName() + " " + _course.getNumber();
	}

	public String getDescription() {
		return _course.getDescription();
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public int getSeatsLeft() {
		return _seatsLeft;
	}

	public void setSeatsLeft(int seatsLeft) {
		_seatsLeft = seatsLeft;
	}

	public List<Student> getStudentList() {
		return _enrollments.stream()
				.map(e -> {
					return e.getStudent();
				})
				.collect(Collectors.toList());
	}

    public void enrolStudent(Student student) {
        Enrollment enrollment = new Enrollment(student);
        _enrollments.add(enrollment);
    }
}
