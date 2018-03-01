
public class SeminarDetails {

	public static void main(String[] args) {
		
		Course course = new Course("Intro", "101", "Introduction");
		Seminar seminar = new Seminar(course);
		
		seminar.getName();
		seminar.getDescription();
		seminar.getLocation();
		seminar.getSeatsLeft();
		seminar.getStudentList();
	}

}
