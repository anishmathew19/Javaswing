package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class loginpage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
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
	public loginpage() {
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
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(54, 33, 71, 14);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(147, 30, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(54, 74, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel label = new JLabel("");
		label.setBounds(158, 159, 105, 28);
		frame.getContentPane().add(label);

		pwd = new JPasswordField();
		pwd.setBounds(147, 71, 86, 20);
		frame.getContentPane().add(pwd);
		
		JButton btnOk = new JButton("SIGN");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String p=""+new String(pwd.getPassword());
				
				if(textField.getText().equals("anish") && p.equals("1234"))
				
					label.setText("succesful");
				
				else
				
					label.setText("unsuccesful");	
			}
		});
		btnOk.setBounds(147, 114, 89, 23);
		frame.getContentPane().add(btnOk);
		
		
		
	}
}
