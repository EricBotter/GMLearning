package refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
	
	class Order {
		double getAmount() {
			return 0;
		}
	}

	Vector _orders;
	private String _name;

	void printOwing() {
		printBanner();
		double outstanding = getOutstanding();
		printDetails(outstanding);
	}

	private double getOutstanding() {
		Enumeration e = _orders.elements();
		double result = 0.0;
		// calculate outstanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}

	private void printDetails(double outstanding) {
		System.out.println("name:" + _name);
		System.out.println("outstanding:" + outstanding);
	}

	private void printBanner() {
		System.out.println("*******************");
		System.out.println("** Customer owes **");
		System.out.println("*******************");
	}
}
