package refactoring.replacetypecodewithstrategy;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
    public abstract int getTypeCode();
    public abstract int extraAmount();
}

class Engineer extends EmployeeType {
	@Override
	public int getTypeCode() {
		return EmployeeType.ENGINEER;
	}

	@Override
	public int extraAmount() {
		return  0;
	}
}

class Manager extends EmployeeType {
	int _bonus;

	public Manager(int bonus) {
		_bonus = bonus;
	}

	@Override
	public int getTypeCode() {
		return EmployeeType.MANAGER;
	}

	@Override
	public int extraAmount() {
		return _bonus;
	}
}
class Salesman extends EmployeeType {
	int _commission;

	public Salesman(int commission) {
		_commission = commission;
	}

	@Override
	public int getTypeCode() {
		return EmployeeType.SALESMAN;
	}

	@Override
	public int extraAmount() {
		return _commission;
	}
}
