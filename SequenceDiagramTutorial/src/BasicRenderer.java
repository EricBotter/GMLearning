
public class BasicRenderer extends Renderer {

	@Override
	String getHeader(Seminar seminar) {
		return "Name: " + seminar.getName() + "\n"
    			+ "Description: " + seminar.getDescription() + "\n"
    			+ "Location: " + seminar.getLocation() + "\n"
    			+ "Start date: " + seminar.getCourse().getStartDate() + "\n"
    			+ "Seats left: " + seminar.getSeatsLeft() + "\n"
    			+ "Enrolled students: ";
	}

	@Override
	void finalize(Seminar seminar, String toPrint) {
		System.out.println(toPrint);
	}
	
	@Override
	String getFooter() {
		return "";
	}

	@Override
	String getStudentLine(Student student) {
		return student.getFullName() + ", ";
	}

	@Override
	String getLastStudentLine(Student student) {
		return student.getFullName();
	}
}
