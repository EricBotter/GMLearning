package refactoring.change_bidirectional_association_to_unidirectional;

import java.util.Iterator;

public class Order {
	private int _grossPrice;

	public Customer getCustomer() {
		Iterator<Customer> iter = Customer.getInstances().iterator();
		while (iter.hasNext()) {
			Customer each = iter.next();
			if (each.containsOrder(this))
				return each;
		}
		return null;
	}
	
	double getDiscountedPrice(Customer customer) {
		return getGrossPrice() * (1 - customer.getDiscount());
	}

	private int getGrossPrice() {
		return _grossPrice;
	}
}
