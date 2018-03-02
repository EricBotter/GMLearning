import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void getTest() {
		Customer customer = new Customer("Eric");
		
		assertEquals(customer.getName(), "Eric");
	}
	
	@Test
	public void statementTest() {
		Movie m1 = new Movie("Old Movie", Movie.REGULAR);
		Movie m2 = new Movie("New Movie", Movie.NEW_RELEASE);
		Movie m3 = new Movie("Children's Movie", Movie.CHILDRENS);
		
		Rental r1 = new Rental(m1, 5); // 6.5
		Rental r2 = new Rental(m1, 2); // 2
		Rental r3 = new Rental(m2, 4); // 12
		Rental r4 = new Rental(m3, 7); // 7.5
		Rental r5 = new Rental(m3, 1); // 1.5

		Customer customer = new Customer("Eric");
		customer.addRental(r1);
		customer.addRental(r2);
		customer.addRental(r3);
		customer.addRental(r4);
		customer.addRental(r5);

		String statement = customer.statement();
		
		assertTrue(statement.contains("Eric"));
		assertTrue(statement.contains("Old Movie\t6.5"));
		assertTrue(statement.contains("Old Movie\t2"));
		assertTrue(statement.contains("New Movie\t12"));
		assertTrue(statement.contains("Children's Movie\t7.5"));
		assertTrue(statement.contains("Children's Movie\t1.5"));
		
		assertTrue(statement.contains("Amount owed is 29.5"));
		assertTrue(statement.contains("You earned 6 frequent renter points"));
	}

	@Test
	public void emptyStatementTest() {
		Customer customer = new Customer("Marco");

		String statement = customer.statement();
		
		assertTrue(statement.contains("Marco"));
		assertTrue(statement.contains("Amount owed is 0"));
		assertTrue(statement.contains("You earned 0 frequent renter points"));

	}
}
