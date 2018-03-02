import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seminar {

	private Course _course;
	private List<Enrollment> _enrollments;

	private String _location;
	private int _seatsLeft;

	public Seminar(Course course) {
		_course = course;
		_enrollments = new ArrayList<Enrollment>();
	}

    public String getInfo() {
        String output = "Name: " + _course.getName() + "\n" +
            "Description: " + _course.getDescription() + "\n" +
            "Location: " + _location + "\n" +
            "Seats left: " + _seatsLeft + "\n" +
            "Enrolled students: ";
        for (Enrollment e : _enrollments) {
            output += e.getInfo() + "; ";
        }
        return output;
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

	public int getSeatsLeft() {
		return _seatsLeft;
	}

	public List<String> getStudentList() {
		return _enrollments.stream()
				.map(e -> {
					return e.getInfo();
				})
				.collect(Collectors.toList());
	}

    public void enrolStudent(Student student) {
        Enrollment enrollment = new Enrollment(student);
        _enrollments.add(enrollment);
    }
}
