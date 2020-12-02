package id.ac.its.ridho170;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame{

	private final JLabel label;
	
	public LabelFrame() 
	{
		super("Project 2");
		setLayout(new FlowLayout());
		
		Icon bug = new ImageIcon(getClass().getResource("Profile.jpg"));
		
		label = new JLabel();
		label.setText("Ridho Ajiraga Jagiswara NRP 05111940000170");
		label.setIcon(bug);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setToolTipText("This is label");
		add(label);
	}
}
