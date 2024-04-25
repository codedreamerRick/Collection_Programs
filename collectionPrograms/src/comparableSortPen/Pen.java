package comparableSortPen;

public class Pen implements Comparable<Pen>{

	public int price;
	public String color;
	public Pen(int price, String color)
	{
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "\nPrice : "+price+", Color : "+color;
	}
	
//			sort based on price		
	
	@Override
	public int compareTo(Pen o) {
		int res = 0;
		if(this.price > o.price)
		{
			res = 1;
		}
		if(this.price < o.price)
		{
			res = -1;
		}
		if(this.price == o.price)
		{
			res = this.color.compareTo(o.color);
		}
		return res;
	}
	
//			sort based on color	
	
//	@Override
//	public int compareTo(Pen o) {
//		if(this.color.compareTo(o.color) == 0)
//		{
//			if(this.price > o.price)
//			{
//				return 1;
//			}
//			if(this.price < o.price)
//			{
//				return -1;
//			}
//			return 0;
//		}
//		else
//		{
//			return this.color.compareTo(o.color);
//		}
//	}
}
