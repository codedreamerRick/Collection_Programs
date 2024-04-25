package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCollection implements Comparator<Integer>{

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(53);
		arr.add(25);
		arr.add(34);
		arr.add(12);
		arr.add(44);
		arr.add(15);
		arr.add(56);
		arr.add(4);
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr, new SortCollection());
		System.out.println(arr);
	}
	

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
