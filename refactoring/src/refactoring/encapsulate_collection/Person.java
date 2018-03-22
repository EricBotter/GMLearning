package refactoring.encapsulate_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	private final Set _courses = new HashSet();

	public Set getCourses() {
		return Collections.unmodifiableSet(_courses);
	}

	public void initializeCourses(Set courses) {
//		Assert.isTrue(_courses.isEmpty());
		_courses.addAll(courses);
	}
	
	public void addCourse(Course arg) {
		_courses.add(arg);
	}
	
	public void removeCourse(Course arg) {
		_courses.remove(arg);
	}
	
	public int numberOfAdvancedCourses() {
		int count = 0;
        Iterator iter = getCourses().iterator();
        while (iter.hasNext()) {
           Course each = (Course) iter.next();
           if (each.isAdvanced()) count ++;
        }
		return count;
	}
	
	public int numberOfCourses() {
		return _courses.size();
	}
	
	
	
	// Client code
	public static void main(String[] args) {
		Person kent = new Person();
		kent.addCourse(new Course ("Smalltalk Programming", false));
        kent.addCourse(new Course ("Appreciating Single Malts", true));
//        Assert.equals (2, kent.getCourses().size());
        Course refact = new Course ("Refactoring", true);
        kent.addCourse(refact);
        kent.addCourse(new Course ("Brutal Sarcasm",false));
//        Assert.equals (4, kent.getCourses().size());
        kent.removeCourse(refact);
//        Assert.equals (3, kent.getCourses().size());
        
        System.out.println(kent.numberOfAdvancedCourses());
	}
}
