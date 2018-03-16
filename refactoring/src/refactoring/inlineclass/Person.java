package refactoring.inlineclass;

public class Person {
	private String _name;
	final TelephoneNumber _officeTelephone = new TelephoneNumber();

	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return _officeTelephone.getTelephoneNumber();
	}

	public TelephoneNumber getOfficeTelephone() {
		return _officeTelephone;
	}
}
