package refactoring.introduce_foreign_method;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date previousEnd = new Date();
		
		Date newStart = nextDay(previousEnd);
		System.out.println(newStart);
	}

	// foreign method for Date
	private static Date nextDay(Date arg) {
		return new Date(
				arg.getYear(),
				arg.getMonth(),
				arg.getDate() + 1
			);
	}
}
