package refactoring.remove_setting_method;

public class Account {

	private final String _id;
	
	Account(String id) {
		_id = id;
	}

	public String getId() {
		return _id;
	}
}
