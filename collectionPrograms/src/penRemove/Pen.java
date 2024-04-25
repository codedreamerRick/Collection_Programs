package penRemove;

public class Pen {

	int price;
	String color;
	public Pen(int price, String color)
	{
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "\nPrice : "+price+" Color : "+color;
	}
}
