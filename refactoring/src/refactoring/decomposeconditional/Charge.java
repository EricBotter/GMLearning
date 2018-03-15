package refactoring.decomposeconditional;

import java.util.Date;

public class Charge {

	private static final Date SUMMER_END = new Date(2018, 21, 9);
	private static final Date SUMMER_START = new Date(2018, 21, 6);
	private double charge;
	private int _summerRate;
	private int _winterRate;
	private int _winterServiceCharge;
	
	double setCharge(Date date, int quantity) {
		if (notSummer(date))
			charge = winterCharge(quantity);
		else
			charge = summerCharge(quantity);
		return charge;
	}

	private int summerCharge(int quantity) {
		return quantity * _summerRate;
	}

	private int winterCharge(int quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}

	private boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
}
