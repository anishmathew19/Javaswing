package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tempcon {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tempcon window = new Tempcon();
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
	public Tempcon() {
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
		
		JLabel lblDegree = new JLabel("Degree");
		lblDegree.setBounds(39, 29, 46, 14);
		frame.getContentPane().add(lblDegree);
		
		textField = new JTextField();
		textField.setBounds(126, 26, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result =");
		lblResult.setBounds(118, 81, 58, 33);
		frame.getContentPane().add(lblResult);
		
		JLabel output = new JLabel("");
		output.setBounds(172, 81, 66, 33);
		frame.getContentPane().add(output);
		
		JButton btnNewButton = new JButton("celcus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float t=Float.parseFloat(textField.getText());
				float temp=(float)(t+273.15);
				String s=String.valueOf(temp);
				output.setText(s);
			}
		});
		btnNewButton.setBounds(28, 140, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("faranhet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float t=Float.parseFloat(textField.getText());
				float temp=(float)((t-273.15)*(9/5)+32 );
				String s=String.valueOf(temp);
				output.setText(s);			
			}
		});
		btnNewButton_1.setBounds(177, 140, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
