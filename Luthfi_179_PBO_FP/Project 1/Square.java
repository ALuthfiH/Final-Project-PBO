package id.ac.its.luthfi179.JOptionPane;

public class Square extends Shape {
	
	private double s;

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public Square() {
		super();
		this.s = 0.0;
	}
	
	public Square(String color, double s) {
		super();
		this.s = s;
	}
	
	@Override
	public double getArea() {
		return s*s;
	}
	
	@Override
	public double getCircumference() {
		return s*4;
	}
}
