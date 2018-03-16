package refactoring.replace_array_with_object;

public class Main {

	public static void main(String[] args) {
		Performance row = new Performance();
		
		row.setName("Liverpool");
		row.setWins(15);

		String name = row.getName();
		int wins = row.getWins();
		
		System.out.println(name);
		System.out.println(wins);
	}

}
