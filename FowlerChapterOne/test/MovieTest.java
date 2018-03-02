import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	@Test
	public void getTest() {
		Movie movie = new Movie("Title", Movie.REGULAR);
		
		assertEquals(movie.getTitle(), "Title");
		assertEquals(movie.getPriceCode(), Movie.REGULAR);
	}
	
	@Test
	public void setTest() {
		Movie movie = new Movie("Title", Movie.REGULAR);
		movie.setPriceCode(Movie.CHILDRENS);
		
		assertEquals(movie.getPriceCode(), Movie.CHILDRENS);
	}

}
