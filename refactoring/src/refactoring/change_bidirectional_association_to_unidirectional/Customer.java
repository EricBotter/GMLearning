package refactoring.change_bidirectional_association_to_unidirectional;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Customer {
	private final Set<Order> _orders = new HashSet<>();
	private int _discount;
	
	public Customer() {
		_instances.add(this);
	}
	
	public boolean containsOrder(Order order) {
		return _orders.contains(order);
	}
	
	void addOrder(Order arg) {
		_orders.add(arg);
	}
	
	double getPriceFor(Order order) {
		return order.getDiscountedPrice(this);
	}

	public int getDiscount() {
		return _discount;
	}
	
	private static Vector<Customer> _instances;
	public static Vector<Customer> getInstances() {
		return _instances;
	}
}
