package sampleswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;


public class Tempconadvan {
	
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tempconadvan window = new Tempconadvan();
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
	public Tempconadvan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Input");
		lb1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lb1.setBounds(120, 30, 46, 14);
		frame.getContentPane().add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(216, 28, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
	
		
		tf2 = new JTextField();
		tf2.setBackground(new Color(255, 99, 71));
		tf2.setBounds(226, 285, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lb2 = new JLabel("Input Scale");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb2.setBounds(62, 92, 74, 27);
		frame.getContentPane().add(lb2);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputScale.setBounds(400, 95, 86, 21);
		frame.getContentPane().add(lblOutputScale);
		
		
		JRadioButton ic = new JRadioButton("Celsus");
		ic.setBounds(27, 149, 109, 23);
		frame.getContentPane().add(ic);
		
		
		JRadioButton ifa = new JRadioButton("Fahrenheit");
		ifa.setBounds(27, 194, 109, 23);
		frame.getContentPane().add(ifa);
	
		JRadioButton ik = new JRadioButton("Kelvin");
		ik.setBounds(27, 243, 109, 23);
		frame.getContentPane().add(ik);
		ButtonGroup input = new ButtonGroup();
		
		input.add(ic);
	input.add(ifa);
	input.add(ik);
		
		JRadioButton oc = new JRadioButton("Celcusi");
		oc.setBounds(377, 149, 109, 23);
		frame.getContentPane().add(oc);
		
		
		JRadioButton ofa = new JRadioButton("Fahrenheit");
		ofa.setBounds(377, 194, 109, 23);
		frame.getContentPane().add(ofa);
		
		
		JRadioButton ok = new JRadioButton("Kelvin");
		ok.setBounds(377, 243, 109, 23);
		frame.getContentPane().add(ok);
		
		
		
	ButtonGroup output = new ButtonGroup();
	output.add(oc);
	output.add(ofa);
	output.add(ok);	
	
	
	ic.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(oc.isSelected())
	    {
	       tf2.setText(str);
	      
	    }
		 if(ofa.isSelected())
		{
			temp=(1.8f*t)+32;
			 tf2.setText(String.valueOf(temp));
		}
	if(ok.isSelected())
		{
			temp=t+ 273.15f;
			 tf2.setText(String.valueOf(temp));
		}
	
		}
	});
	
	ifa.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(oc.isSelected())
	    {
	      
	       temp=((t-32)*5)/9;
	       tf2.setText(String.valueOf(temp));
	      
	    }
		 if(ofa.isSelected())
		{
			 tf2.setText(str);
			 
		}
		if(ok.isSelected())
		{
			temp=(((t-32)*5)/9)+273.15f; 
			 tf2.setText(String.valueOf(temp));
		}
	
		}
	});
	ik.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(oc.isSelected())
	    {
	      
	       temp=t-273.15f;
	       tf2.setText(String.valueOf(temp));
	      
	    }
		 if(ofa.isSelected())
		{
			
			temp=(((t-273.15f)*9)/5)+32; 
			 tf2.setText(String.valueOf(temp));	 
		}
		 if(ok.isSelected())
		{
			tf2.setText(str);
			
		}
	
		}
	});
	
	
	//Output side
	
	oc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(ic.isSelected())
	    {
	       tf2.setText(str);
	      
	    }
		 if(ifa.isSelected())
		{
			 temp=((t-32)*5)/9;
		       tf2.setText(String.valueOf(temp));
		}
	if(ik.isSelected())
		{
			temp=t-273.15f;
			 tf2.setText(String.valueOf(temp));
		}
	
		}
	});
	
	ofa.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(ic.isSelected())
	    {
	      
	       temp=(1.8f*t)+32;
	       tf2.setText(String.valueOf(temp));
	      
	    }
		 if(ifa.isSelected())
		{
			 tf2.setText(str);
			 
		}
		if(ik.isSelected())
		{
			temp=(((t-273.15f)*9)/5)+32; 
			 tf2.setText(String.valueOf(temp));
		}
	
		}
	});
	ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		String str=tf1.getText();   
		
		float t=Float.parseFloat(str);
		float temp;
		if(ic.isSelected())
	    {
	      
	       temp=t+273.15f;
	       tf2.setText(String.valueOf(temp));
	      
	    }
		 if(ifa.isSelected())
		{
			
			temp=(((t-32)*5)/9)+273.15f; 
			 tf2.setText(String.valueOf(temp));	 
		}
		 if(ik.isSelected())
		{
			tf2.setText(str);
			
		}
	
		}
	});
	
	
	
	
	
	
		JLabel lb4 = new JLabel("Output");
		lb4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lb4.setBounds(120, 288, 92, 14);
		frame.getContentPane().add(lb4);
		
	}
}
