package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCartImpl implements ShoppingCart {

	private HashMap<Item, Integer> contents = new HashMap<Item, Integer>();
	private int size = 0;

	@Override
	public void add(Item i, int quantity) {
	    int howMany = (contents.containsKey(i) ? contents.get(i) : 0);
		contents.put(i,howMany + quantity);
		size += quantity;
	}

	@Override
	public void delete(Item i, int quantity) {
		int q = Math.min(quantity, get(i));
		contents.put(i, contents.get(i) - q);
		size -= q;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int get(Item i) {
		return contents.get(i);
	}

	@Override
	public Iterator<Map.Entry<Item,Integer>> iterator() {
		return contents.entrySet().iterator();
	}
}
