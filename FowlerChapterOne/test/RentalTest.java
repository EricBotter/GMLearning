import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {

	@Test
	public void getTest() {
		Movie movie = new Movie("Title", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, 3);
		
		assertEquals(rental.getMovie(), movie);
		assertEquals(rental.getDaysRented(), 3);
	}

}
