package refactoring.preservewholeobject;

public class TempRange {
	
	public int getLow() {
		return 0;
	}

	public int getHigh() {
		return 10;
	}

	boolean includes(TempRange aRange) {
		return aRange.getLow() >= getLow()
				&& aRange.getHigh() <= getHigh();
	}
}
