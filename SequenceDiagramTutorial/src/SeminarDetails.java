
public class SeminarDetails {

	public static void main(String[] args) {
		
        Student s1 = new Student("Eric", "Botter");
        Student s2 = new Student("Marco", "Verdi");
		Course course = new Course("Intro", "101", "Introduction Course");

		Seminar seminar = new Seminar(course);
        seminar.enrolStudent(s1);
        seminar.enrolStudent(s2);
		
        System.out.println(seminar.getInfo());
	}

}
