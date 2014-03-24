package demo;


import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DojoTests {

	private ShoppingCart emptyCart;
	private ShoppingCart nonEmptyCart;

	@Before
	public void setup() {
		emptyCart = new ShoppingCartImpl();
		nonEmptyCart = new ShoppingCartImpl();
		nonEmptyCart.add(Main.BOOK, 2);
		nonEmptyCart.add(Main.MOVIE, 5);
	}

	@After
	public void cleanup()  {
		emptyCart = null;
		nonEmptyCart = null;
	}

	@Test
	public void testTheTruthIsTheTruth() {
		assertTrue(true);
	}

	@Test
	public void testTailleDuPanier() {
		assertEquals(emptyCart.size(),0);
		assertEquals(nonEmptyCart.size(), 7) ;

	}

	@Test
	public void testSuppression() {
		nonEmptyCart.delete(Main.MOVIE, 3);
		assertEquals(nonEmptyCart.size(), 4);
	}

	@Test
	public void testTropDeSuppression() {
		nonEmptyCart.delete(Main.MOVIE, 30);
		assertEquals(2, nonEmptyCart.size());
	}

	@Test
	public void testSuppressionPanierVide() {
		emptyCart.delete(Main.BOOK, 1);

	}


}
