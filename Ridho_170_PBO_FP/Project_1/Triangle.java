package id.ac.its.ridho170.JOptionPane;

public class Triangle extends Shape{

	private double a; //panjang alas
	private double b; //tinggi
	private double c; //panjang sisi miring
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Triangle() {
		
		super();
		
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
	}
	
	public Triangle(String color, double a, double b, double c) {
		
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	@Override
	public double getArea() {
		
		return (this.a * this.b) / 2;
	}

	@Override
	public double getCircumference() {
		
		return a + 2 * c;
	}

}
