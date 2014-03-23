package demo;

public class Main {

	public static final Item BOOK  = new Item(1, "Pragmatic Unit Testing", "An awesome book about testing");
	public static final Item MOVIE = new Item(2, "PhD Comics, the movie", "An awesome move");

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCartImpl();
		cart.add(BOOK, 3);
		cart.add(MOVIE, 2);
		cart.delete(BOOK, 1);
		System.out.println("Book:  " + cart.get(BOOK));
		System.out.println("Movie: " + cart.get(MOVIE));
		System.out.println("size => " + cart.size());
	}
}
