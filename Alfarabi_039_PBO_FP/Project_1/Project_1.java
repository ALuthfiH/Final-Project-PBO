package id.ac.its.Alfarabi039;

import javax.swing.JOptionPane;

public class Project_1 {

	public static void main(String[] args) {
		String firstNumber =
				JOptionPane.showInputDialog("Enter a");
		
		String secondNumber =
				JOptionPane.showInputDialog("Enter b");
		
		String thirdNumber =
				JOptionPane.showInputDialog("Enter h");
		
		int a = Integer.parseInt(firstNumber);
		int b = Integer.parseInt(secondNumber);
		int h = Integer.parseInt(thirdNumber);
		
		double getLuas = (a+b)*h/2;
		double getKeliling = 2*(a+b);
		
		JOptionPane.showMessageDialog(null, "Luasnya : " + getLuas + "\nKelilingnya : " + getKeliling,
				"Luas dan Keliling Trapesium", JOptionPane.PLAIN_MESSAGE);
	}

}
