package comparableSortPen;

import java.util.ArrayList;
import java.util.Collections;

import comparator.ColorAndPriceAsce;
import comparator.PriceAndColorAsce;
import comparator.PriceAsce;
import comparator.PriceDsce;

public class PenDriver {

	public static void main(String[] args) {
		ArrayList<Pen> pens = new ArrayList<>();
		pens.add(new Pen(90, "Red"));
		pens.add(new Pen(20, "Blue"));
		pens.add(new Pen(20, "Red"));
		pens.add(new Pen(50, "Green"));
		pens.add(new Pen(50, "Black"));
		pens.add(new Pen(10, "Blue"));
		
		Collections.sort(pens);
		System.out.println(pens);
		System.out.println("Sort based on Price Ascending");
		Collections.sort(pens, new PriceAsce());
		System.out.println(pens);
		System.out.println("Sort based on Price Descending");
		Collections.sort(pens, new PriceDsce());
		System.out.println(pens);
		Collections.sort(pens, new PriceAndColorAsce());
		System.out.println(pens);
		Collections.sort(pens, new ColorAndPriceAsce());
		System.out.println(pens);
	}
}
