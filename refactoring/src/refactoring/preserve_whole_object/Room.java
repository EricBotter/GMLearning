package refactoring.preserve_whole_object;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}

	private TempRange daysTempRange() {
		return null;
	}
}
