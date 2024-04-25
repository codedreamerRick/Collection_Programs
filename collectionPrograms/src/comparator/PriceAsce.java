package comparator;

import java.util.Comparator;

import comparableSortPen.Pen;

public class PriceAsce implements Comparator<Pen> {

	public int compare(Pen o1, Pen o2) {
		return o1.price - o2.price;
	}
}
