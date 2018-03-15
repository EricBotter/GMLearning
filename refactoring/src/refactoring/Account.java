package refactoring;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	private final Vector _entries = new Vector();

	double getFlowBetween(DateRange range) {
		double result = 0;
		Enumeration e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (range.includes(each.getDate())) {
				result += each.getValue();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Account a = new Account();
		Date start = new Date();
		Date end = new Date();
		a.getFlowBetween(new DateRange(start, end));
	}
}
