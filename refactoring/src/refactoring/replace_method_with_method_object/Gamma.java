package refactoring.replace_method_with_method_object;

public class Gamma {
	private final Account _account;
	private final int inputVal;
	private final int quantity;
	private final int yearToDate;
	private int value1;
	private int value2;
	private int value3;
	
	Gamma (Account source, int inputValArg, int quantityArg, int yearToDateArg) {
		_account = source;
		inputVal = inputValArg;
		quantity = quantityArg;
		yearToDate = yearToDateArg;
	}
	
	int compute() {
		value1Init();
		value2Init();
		value2Discount();
		value3Init();
		return value3 - 2 * value1;
	}

	private void value3Init() {
		value3 = value2 * 7;
	}

	private void value2Init() {
		value2 = (inputVal * yearToDate) + 100;
	}

	private void value1Init() {
		value1 = (inputVal * quantity) + _account.delta();
	}

	private void value2Discount() {
		if ((yearToDate - value1) > 100)
			value2 -= 20;
	}

}
