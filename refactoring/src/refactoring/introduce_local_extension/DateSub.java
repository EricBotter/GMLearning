package refactoring.introduce_local_extension;

import java.util.Date;

public class DateSub extends Date {
	public DateSub (String dateString) {
		super(dateString);
	}
	
	public DateSub(Date arg) {
		super(arg.getTime());
	}
	
	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}
}
