package collection;

import java.util.ArrayList;

public class Add {

	public static void main(String[] args) {
		ArrayList bag = new ArrayList();
		bag.add("English");
		bag.add("Bengali");
		bag.add("Hindi");
		System.out.println(bag);
		ArrayList bag1 = new ArrayList();
		bag1.add("English");
		bag1.add("Bengali");
		bag1.add("Kanada");
		System.out.println(bag1);
//		bag.addAll(bag1);
//		System.out.println(bag);
//		bag.retainAll(bag1);
//		System.out.println(bag);
//		System.out.println(bag.retainAll(bag1));
		bag.removeAll(bag1);
		System.out.println(bag);
	}
}
