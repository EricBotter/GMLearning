package refactoring.inline_class;

public class Person {
	private String _name;
	private String _areaCode;
	private String _number;

	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return "(" + getAreaCode() + ") " + getNumber();
	}
	
	public String getAreaCode() {
		return _areaCode;
	}
	
	public void setAreaCode(String arg) {
		_areaCode = arg;
	}
	
	public String getNumber() {
		return _number;
	}
	
	public void setNumber(String arg) {
		_number = arg;
	}
}
