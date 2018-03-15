package refactoring.preservewholeobject;

public class HeatingPlan {

	private TempRange _range;

	boolean withinRange(TempRange roomRange) {
		return _range.includes(roomRange);
	}
}
