package id.ac.its.Alfarabi039;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Project_2 extends JFrame {
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	public Project_2() 
	{
		super("Project 2");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Mahasiswa");
		label1.setToolTipText("This is Label 1");
		
		Icon bug = new ImageIcon(getClass().getResource("fotobibi.jpg"));
		label2 = new JLabel("05111940000039", bug, SwingConstants.LEFT);
		add(label2);
		
		label3 = new JLabel();
		label3.setText("A\nlfarabi Muzli");
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label 3");
		add(label3);
	}
}
