package id.ac.its.ridho170.JOptionPane;

import javax.swing.JOptionPane;

public class ShapeTest {

	public static void main(String[] args) {
		
		// obtain user input from JOptionPane input dialogs
		String a = JOptionPane.showInputDialog("Enter a");
		String b = JOptionPane.showInputDialog("Enter b");
		String c = JOptionPane.showInputDialog("Enter c");
		
		Triangle t1 = new Triangle();
		
		t1.setA(Integer.parseInt(a));
		t1.setB(Integer.parseInt(b));
		t1.setC(Integer.parseInt(c));
		
		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "The area is " + t1.getArea() + 
				" and The circumference is " + t1.getCircumference(),
				"Area and Circumference of Triangle", JOptionPane.PLAIN_MESSAGE);
	}
}
