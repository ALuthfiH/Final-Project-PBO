package id.ac.its.luthfi179.JOptionPane;

import javax.swing.JOptionPane;

public class ShapeTest {
	
	public static void main(String[] args) {
		// obtain user input from JOptionPane input dialogs
		String s = JOptionPane.showInputDialog("Enter length of square : ");
		
		Square s1 = new Square();
		
		s1.setS(Integer.parseInt(s));
		
		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "The area of square is " + s1.getArea() + 
				" and The circumference of the square is " + s1.getCircumference(),
				"Area and Circumference of Triangle", JOptionPane.PLAIN_MESSAGE);
	}
}
