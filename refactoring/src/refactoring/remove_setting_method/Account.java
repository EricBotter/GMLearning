package refactoring.remove_setting_method;

public class Account {

	private String _id;
	
	protected Account() {
	}
	
	Account(String id) {
		setId(id);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}
}
