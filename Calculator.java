package sampleswing;
import java.lang.Math;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField num;
String str1;
String str2;
String op;
int c=0;
int dc=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 8));
		frame.setBounds(100, 100, 573, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(42, 11, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(77, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		num = new JTextField();
		num.setBounds(10, 48, 399, 32);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(311, 108, 44, 44);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(365, 108, 44, 44);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(413, 108, 44, 44);
		frame.getContentPane().add(b9);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(413, 164, 44, 44);
		frame.getContentPane().add(b6);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(365, 164, 44, 44);
		frame.getContentPane().add(b5);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(311, 164, 44, 44);
		frame.getContentPane().add(b4);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(413, 219, 44, 44);
		frame.getContentPane().add(b3);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(365, 219, 44, 44);
		frame.getContentPane().add(b2);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(311, 219, 44, 44);
		frame.getContentPane().add(b1);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				if(c==1)
				{
					num.setText("");
					c=0;
					dc=0;
				}
				num.setText(num.getText().concat(b0.getText()));
				
			}
		});
		b0.setBounds(311, 274, 44, 44);
		frame.getContentPane().add(b0);
		
		JButton button_9 = new JButton("=");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{    c=1;
				 str2=num.getText();
				 float res;
				 String result;
				 float ip1=Float.parseFloat(str1);
				 float ip2=Float.parseFloat(str2);
				 if(op.equals("add"))
				 {
					 res=ip1+ip2;
					 result=String.valueOf(res);
					 num.setText(result);
					
				 }
				 if(op.equals("sub"))
				 {
					 res=ip1-ip2;
					 result=String.valueOf(res);
					 num.setText(result);
				 }
				 if(op.equals("mul"))
				 {
					 res=ip1*ip2;
					 result=String.valueOf(res);
					 num.setText(result);
				 }
				
				 if(op.equals("div"))
				 {
					 if(ip2==0)
					 {
						 num.setText("not defined");
					 }
					 else
					 {
					 res=ip1/ip2;
					 result=String.valueOf(res);
					 num.setText(result);
					 
				 }
				 }
				 if(op.equals("pow"))
				 {
					 res=(float)Math.pow(ip1,ip2);
					 result=String.valueOf(res);
					 num.setText(result);
					
				 }
				 if(op.equals("per"))
				 {
					 res=(float)(ip1/ip2)*100;
					 result=String.valueOf(res);
					 num.setText(result);
					
				 }
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_9.setBounds(413, 275, 44, 44);
		frame.getContentPane().add(button_9);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=num.getText();
				num.setText("");
				op="add";
				
			}
		});
		btnNewButton_8.setBounds(467, 274, 44, 44);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=num.getText();
				num.setText("");
				op="div";
				
			}
		});
		button_10.setBounds(467, 108, 44, 44);
		frame.getContentPane().add(button_10);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=num.getText();
				num.setText("");
				op="mul";
			}
		});
		btnX.setBounds(467, 164, 44, 44);
		frame.getContentPane().add(btnX);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=num.getText();
				num.setText("");
				op="sub";
				
			}
			
		});
		button_11.setBounds(467, 219, 44, 44);
		frame.getContentPane().add(button_11);
		
		JButton bpoint = new JButton(".");
		bpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c==1)
				{
				num.setText("");
				c=0;
				dc=0;
				}
				if(dc==0)
				{
				num.setText(num.getText().concat(bpoint.getText()));
				dc=1;
				}
				//num.setText(num.getText().concat(bpoint.getText()));
				
			}
		});
		bpoint.setBounds(365, 274, 44, 44);
		frame.getContentPane().add(bpoint);
		
		JButton sqrt = new JButton("Sqrt");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c=1;
				 String s1=num.getText();
				 float op1=(float)Math.sqrt(Float.parseFloat(s1));
				 String s2=String.valueOf(op1);
				 num.setText(s2);
				 
				 
			}
		});
		sqrt.setFont(new Font("Tahoma", Font.PLAIN, 7));
		sqrt.setBounds(10, 119, 60, 44);
		frame.getContentPane().add(sqrt);
		
		JButton inv = new JButton("1/X");
		inv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op1=(float)(1/Float.parseFloat(s1));
				String s2=String.valueOf(op1);
				num.setText(s2);
			}
		});
		inv.setBounds(77, 118, 60, 44);
		frame.getContentPane().add(inv);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				c=1;
				String s1=num.getText();
				float op3= Float.parseFloat(s1);
				
				 float op1=(float)Math.sin(op3*(float)Math.PI/180);
				 String s2=String.valueOf(op1);
				 num.setText(s2);
			}
		});
		btnSin.setBounds(147, 118, 60, 44);
		frame.getContentPane().add(btnSin);
		
		JButton btnNewButton = new JButton("Cos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op3= Float.parseFloat(s1);
				
				 float op1=(float)Math.cos(op3*(float)Math.PI/180);
				 String s2=String.valueOf(op1);
				 num.setText(s2);
				
			}
			
		});
		btnNewButton.setBounds(147, 175, 60, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tan");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op3= Float.parseFloat(s1);
				
				 float op1=(float)Math.tan(op3*(float)Math.PI/180);
				 String s2=String.valueOf(op1);
				 num.setText(s2);
			}
		});
		btnNewButton_1.setBounds(147, 230, 60, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("n!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String s1=num.getText();
				 int op1=Integer.parseInt(s1);
				 int fact=1;
				 for(int i=1;i<=op1;i++)
				 {
					 fact=fact*i;
				 }
				 String s2=String.valueOf(fact);
				 num.setText(s2);
			}
		});
		btnNewButton_2.setBounds(10, 174, 60, 44);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("x^y");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=num.getText();
				op="pow";
				num.setText("");
			}
		});
		btnNewButton_4.setBounds(77, 175, 60, 44);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("X^2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op1=Float.parseFloat(s1);
				float op2=op1*op1;
				String s2=String.valueOf(op2);
				num.setText(s2);
				
			}
		});
		btnNewButton_5.setBounds(77, 230, 60, 44);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Clear");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText("");
				dc=0;
			}
		});
		btnNewButton_6.setBounds(147, 289, 75, 44);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton delete = new JButton("Delete");
		delete.setFont(new Font("Tahoma", Font.PLAIN, 10));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=num.getText();
				String s2="";
				int le=s1.length();
				for(int i=0;i<le-1;i++)
				{
					s2=s2+s1.charAt(i);
				}
				num.setText(s2);
			}
		});
		delete.setBounds(452, 43, 95, 44);
		frame.getContentPane().add(delete);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				str1=num.getText();
				op="per";
				num.setText("");
				dc=0;
			}
		});
		btnPer.setBounds(10, 230, 60, 44);
		frame.getContentPane().add(btnPer);
		
		JButton log = new JButton("log");
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op1=(float)Math.log10(Float.parseFloat(s1));
				float op2=op1*op1;
				String s2=String.valueOf(op2);
				num.setText(s2);
			}
		});
		log.setBounds(10, 289, 60, 44);
		frame.getContentPane().add(log);
		
		JButton bexp = new JButton("Exp");
		bexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=1;
				String s1=num.getText();
				float op1=(float)Math.exp(Float.parseFloat(s1));
				float op2=op1*op1;
				String s2=String.valueOf(op2);
				num.setText(s2);
			}
		});
		bexp.setBounds(77, 289, 60, 44);
		frame.getContentPane().add(bexp);
	}
}
