package comparator;

import java.util.Comparator;

import comparableSortPen.Pen;

public class ColorAndPriceAsce implements Comparator<Pen> {

	public int compare(Pen o1, Pen o2) {
		if(o1.color.compareTo(o2.color) == 0)
		{
			return o1.price - o2.price;
		}
		return o1.color.compareTo(o2.color);
	}
}
