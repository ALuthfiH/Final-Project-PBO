package id.ac.its.luthfi179.JOptionPane;

public abstract class Shape {

	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Shape() {
		this.color = "Blue";
		System.out.println("[Shape] Default constructor");
	}

	public Shape(String color) {
		this.color = color;
		System.out.println("[Shape] Constructor (color)");
	}
	
	public abstract double getArea();
	public abstract double getCircumference();
}
