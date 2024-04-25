package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

import comparableSortPen.Pen;

public class Example1 implements Comparator<Pen>{

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new Pen(10,"blue"));
		t.add(new Pen(20,"black"));
		t.add(new Pen(20, "blue"));
		t.add(new Pen(40, "black"));
		t.add(new Pen(50, "white"));
		t.add(new Pen(60, "red"));
		
//		TreeSet t1 = new TreeSet(new Example1());
//		t1.addAll(t);
		System.out.println(t);
//		System.out.println(t1);
		
	}
	@Override
	public int compare(Pen o1, Pen o2) {
		return o2.price - o1.price;
	}
}

//class Decs implements Comparator<Pen>
//{
//	@Override
//	public int compare(Pen o1, Pen o2) {
//		return o2.price - o1.price;
//	}
//}
