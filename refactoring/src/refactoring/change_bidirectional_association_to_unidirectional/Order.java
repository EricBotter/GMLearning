package refactoring.change_bidirectional_association_to_unidirectional;

public class Order {
	private Customer _customer;
	private int _grossPrice;

	public Customer getCustomer() {
		return _customer;
	}

	public void setCustomer(Customer arg) {
		if (_customer != null)
			_customer.friendOrders().remove(this);
		_customer = arg;
		if (_customer != null)
			_customer.friendOrders().add(this);
	}
	
	double getDiscountedPrice() {
		return getGrossPrice() * (1 - _customer.getDiscount());
	}

	private int getGrossPrice() {
		return _grossPrice;
	}
}
