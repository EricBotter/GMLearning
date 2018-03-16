package refactoring.preserve_whole_object;

public class HeatingPlan {

	private TempRange _range;

	boolean withinRange(TempRange roomRange) {
		return _range.includes(roomRange);
	}
}
