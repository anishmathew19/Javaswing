package sampleswing;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class checkboxexample {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkboxexample window = new checkboxexample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public checkboxexample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(117, 168, 249, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxC = new JCheckBox("c++");
		chckbxC.setBounds(117, 51, 97, 23);
		frame.getContentPane().add(chckbxC);
		
		JCheckBox chckbxJava = new JCheckBox("java");
		chckbxJava.setBounds(117, 89, 97, 23);
		frame.getContentPane().add(chckbxJava);
		
		chckbxC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
			lblNewLabel.setText("C++ "+(e.getStateChange()==1?"Checked":"Unchecked"));
			
		}
		});
		chckbxJava.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
			lblNewLabel.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
			
		}
		});
		
	}
}
