
public abstract class Renderer {
	public void output(Seminar seminar) {
    	String output = getHeader(seminar);
    	
        int lastIndex = seminar.getStudentList().size() - 1;
		for (int i = 0; i < lastIndex; i++) {
        	output += getStudentLine(seminar.getStudentList().get(i));
        }
        output += getLastStudentLine(seminar.getStudentList().get(lastIndex));
    	output += getFooter();
    	finalize(seminar, output);
	}

	abstract String getHeader(Seminar seminar); 
	abstract String getStudentLine(Student student);
	abstract String getLastStudentLine(Student student);
	abstract String getFooter();
	abstract void finalize(Seminar seminar, String toPrint);
}
