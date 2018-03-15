package refactoring.extractsubclass;

public abstract class JobItem {
	private final int _quantity;
	
	public JobItem(int quantity) {
		_quantity = quantity;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}

	public int getQuantity() {
		return _quantity;
	}

	public abstract int getUnitPrice();
	public abstract boolean isLabor();
}
