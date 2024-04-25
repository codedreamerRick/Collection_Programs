package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountNoOfChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		HashMap map = new HashMap();
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			map.put(c, map.get(c) == null ? 1 : ((Integer)map.get(c)) + 1);
		}
		System.out.println(map);
	}
}
