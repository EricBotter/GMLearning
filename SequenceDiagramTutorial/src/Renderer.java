
public abstract class Renderer {
	public void output(Seminar seminar) {
    	String output = getHeader(seminar);
    	
    	for (Student student: seminar.getStudentList())
    		output += getStudentLine(student);

    	output += getFooter();

    	finalize(seminar, output);
	}

	abstract String getHeader(Seminar seminar); 
	abstract String getStudentLine(Student student);
	abstract String getFooter();
	abstract void finalize(Seminar seminar, String toPrint);
}
