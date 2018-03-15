package refactoring.preservewholeobject;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}

	private TempRange daysTempRange() {
		return null;
	}
}
