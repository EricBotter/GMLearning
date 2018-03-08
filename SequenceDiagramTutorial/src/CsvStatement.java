import java.io.FileWriter;
import java.io.IOException;

public class CsvStatement extends Statement {

	@Override
	String getHeader(Seminar seminar) {
		return String.join(";", new String[] {
    			seminar.getCourse().getNumber(),
    			seminar.getCourse().getName(),
    			seminar.getDescription(),
    			seminar.getLocation(),
    			String.valueOf(seminar.getSeatsLeft())
    	}) + "\n";
	}

	@Override
	void finalize(Seminar seminar, String csv) {
		try {
			FileWriter fw = new FileWriter(seminar.getName() + ".csv");
	    	fw.write(csv);
	    	fw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	String getFooter() {
		return "";
	}

	@Override
	String getStudentLine(Student student) {
		return student.getName() + ";" + student.getSurname() + "\n";
	}

	@Override
	String getLastStudentLine(Student student) {
		return getLastStudentLine(student);
	}
	
}
