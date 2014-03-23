package demo;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MyTests {

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
	public void testSizeIsConsistent() {
		assertEquals(emptyCart.size(), 0);
		assertEquals(nonEmptyCart.size(), 7);
	}

	@Test
	public void testAddIncreaseSize() {
		nonEmptyCart.add(Main.BOOK,1);
		assertEquals(nonEmptyCart.size(), 8);
		assertEquals(nonEmptyCart.get(Main.BOOK),3);
	}

}
