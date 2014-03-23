package demo;

import java.util.Iterator;

public interface ShoppingCart {

	public void add(Item i, int quantity);

	public void delete(Item i, int quantity);

	public int size();

	public int get(Item i);

	public Iterator<Entry> iterator();

}
