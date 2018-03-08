import java.io.FileWriter;
import java.io.IOException;

public class SeminarDetails {

    private final Seminar _seminar;

    public SeminarDetails(Seminar seminar) {
        _seminar = seminar;
    }
    
    public void printHtml() {
    	String html = "<html>\n<head>\n\t<title>" + _seminar.getName() + "</title>\n"
    			+ "</head>\n<body>\n"
    			+ "\t<div>" + _seminar.getName() + ":</div>\n\t<ul>\n"
    			+ "\t\t<li>" + _seminar.getDescription() + "</li>\n"
    			+ "\t\t<li>" + _seminar.getLocation() + "</li>\n"
    			+ "\t\t<li>" + _seminar.getSeatsLeft() + "</li>\n"
    			+ "\t</ul>\n\t<div>partecipanti:</div>\n\t<ul>\n";
    	for (Student student : _seminar.getStudentList())
    		html += "\t\t<li>" + student.getFullName() + "</li>\n";
    	html += "\t</ul>\n</body>\n</html>";
    	System.out.println(html);
    }
    
    public void saveToCsv() throws IOException {
    	String csv = String.join(";", new String[] {
    			_seminar.getCourse().getNumber(),
    			_seminar.getCourse().getName(),
    			_seminar.getDescription(),
    			_seminar.getLocation(),
    			String.valueOf(_seminar.getSeatsLeft())
    	}) + "\n";
    	for (Student student : _seminar.getStudentList())
    		csv += student.getName() + ";" + student.getSurname() + "\n";
    	
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
		
        new BasicStatement().output(details._seminar);
        new HtmlStatement().output(details._seminar);
//        new CsvStatement().output(details._seminar);
        
	}

}
