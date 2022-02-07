package Comparable;

public class Bean_Class implements Comparable{
	String color;
	String brand;
	double price;
	public Bean_Class(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		
		Bean_Class bn = (Bean_Class)o;
		if(price==bn.price)
		{
			return 0;
		}
		else if(price>bn.price)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
