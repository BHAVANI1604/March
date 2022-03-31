package newLms;

public class Color {
	String brand;
	int price;
	String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Color [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	public Color(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

}
