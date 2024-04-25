package hashMap;

import java.util.Map.Entry;
import java.util.HashMap;

public class TokenDriver {

	public static void main(String[] args) {
		HashMap<Token, String> map = new HashMap();
		map.put(new Token(121, "12/3/23"), "Rick");
		map.put(new Token(122, "12/3/23"), "Rick");
		map.put(new Token(123, "12/4/23"), "Vikas");
		Token t1 = new Token(121, "12/3/23");
		map.put(t1, "Hari");
		t1.no = 120;
		t1.date = "13/4/23";
		map.put(new Token(121, "12/3/23"), "Mahan");
		
		for(Entry e : map.entrySet())
		{
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
		}
	}
}

class Token
{
	int no;
	String date;
	
	Token(int no, String date)
	{
		this.no = no;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "\nToken No : "+no+" Date : "+date;
	}
}
