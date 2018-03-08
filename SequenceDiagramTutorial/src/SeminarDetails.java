import java.io.FileWriter;
import java.io.IOException;

public class SeminarDetails {

    private final Seminar _seminar;

    public SeminarDetails(Seminar seminar) {
        _seminar = seminar;
    }

    public void printBasic() {
    	String toPrint = "Name: " + _seminar.getName() + "\n"
    			+ "Description: " + _seminar.getDescription() + "\n"
    			+ "Location: " + _seminar.getLocation() + "\n"
    			+ "Seats left: " + _seminar.getSeatsLeft() + "\n"
    			+ "Enrolled students: ";
        System.out.print(toPrint);
        System.out.println(_seminar.getStudentList());
    }
    
    public void printHtml() {
    	String html = "<html>\n<head>\n\t<title>" + _seminar.getName() + "</title>\n"
    			+ "</head>\n<body>\n"
    			+ "\t<div>" + _seminar.getName() + "</div>\n\t<ul>\n"
    			+ "\t\t<li>" + _seminar.getDescription() + "</li>\n"
    			+ "\t\t<li>" + _seminar.getLocation() + "</li>\n"
    			+ "\t\t<li>" + _seminar.getSeatsLeft() + "</li>\n"
    			+ "\t</ul>\n\t<div>partecipanti:</div>\n\t<ul>\n";
    	for (String student : _seminar.getStudentList())
    		html += "\t\t<li>" + student + "</li>\n";
    	html += "\t</ul>\n</body>\n</html>";
    	System.out.println(html);
    }
    
    public void saveToCsv() throws IOException {
    	String csv = String.join(";", new String[] {
    			_seminar.getName(),
    			_seminar.getDescription(),
    			_seminar.getLocation(),
    			String.valueOf(_seminar.getSeatsLeft())
    	});
    	for (String student : _seminar.getStudentList())
    		csv += student;
    	
    	FileWriter fw = new FileWriter(_seminar.getName() + ".csv");
    	fw.write(csv);
    	fw.close();
    }

	public static void main(String[] args) {
		
        Student s1 = new Student("Eric", "Botter");
        Student s2 = new Student("Marco", "Verdi");
		Course course = new Course("Intro", "101", "Introduction Course");

		Seminar seminar = new Seminar(course);
        seminar.enrolStudent(s1);
        seminar.enrolStudent(s2);

        SeminarDetails details = new SeminarDetails(seminar);
		
        details.printBasic();
	}

}
