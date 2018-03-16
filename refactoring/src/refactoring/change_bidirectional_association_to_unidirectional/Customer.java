package refactoring.change_bidirectional_association_to_unidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private final Set<Order> _orders = new HashSet<>();
	private int _discount;
	
	Set<Order> friendOrders() {
		return _orders;
	}
	
	void addOrder(Order arg) {
		arg.setCustomer(this);
	}
	
	double getPriceFor(Order order) {
		return order.getDiscountedPrice();
	}

	public int getDiscount() {
		return _discount;
	}
}
