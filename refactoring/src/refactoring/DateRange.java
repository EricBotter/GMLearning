package refactoring;

import java.util.Date;

public class DateRange {
	private final Date _start, _end;

	public DateRange(Date start, Date end) {
		_start = start;
		_end = end;
	}

	public Date getStart() {
		return _start;
	}

	public Date getEnd() {
		return _end;
	}

	public boolean includes(Date date) {
		return date.equals(getStart()) || date.equals(getEnd()) ||
				(date.after(getStart()) && date.before(getEnd()));
	}
}
