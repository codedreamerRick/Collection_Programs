package comparator;

import java.util.Comparator;

import comparableSortPen.Pen;

public class PriceDsce implements Comparator<Pen> {

	public int compare(Pen o1, Pen o2) {
		return o2.price - o1.price;
	}
}
