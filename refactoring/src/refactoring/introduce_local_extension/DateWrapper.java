package refactoring.introduce_local_extension;

import java.util.Date;

public class DateWrapper {
	private final Date _original;
	
	public DateWrapper(String dateString) {
		_original = new Date(dateString);
	}
	
	public DateWrapper(Date arg) {
		_original = arg;
	}
	
	public int getYear() {
		return _original.getYear();
	}

	public int getMonth() {
		return _original.getMonth();
	}
	
	public int getDay() {
		return _original.getDay();
	}
	
	public int getDate() {
		return _original.getDate();
	}
	
	Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}
}
