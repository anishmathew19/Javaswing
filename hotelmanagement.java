package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class hotelmanagement {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf8;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	float ckb=150;
	float cmb=200;
	float chb=130;
	float tea=15;
	float cof=13;
	float juice=50;
	float tax;
	int c=0;
	int dc=0;
	String st1;
	String st2;
	String op;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmanagement window = new hotelmanagement();
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
	public hotelmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.getContentPane().setForeground(new Color(0, 250, 154));
		frame.setBounds(100, 100, 936, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 61, 364, 277);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger ");
		lblChickenBurger.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblChickenBurger.setBounds(10, 37, 114, 17);
		panel.add(lblChickenBurger);
		
		tf1 = new JTextField();
		tf1.setText("0");
		tf1.setBounds(179, 35, 86, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblChickenBurgerMeal.setBounds(10, 86, 114, 17);
		panel.add(lblChickenBurgerMeal);
		
		tf2 = new JTextField();
		tf2.setText("0");
		tf2.setBounds(179, 86, 86, 20);
		panel.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblChieseBurger = new JLabel("Chiese Burger");
		lblChieseBurger.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblChieseBurger.setBounds(10, 136, 93, 14);
		panel.add(lblChieseBurger);
		
		tf3 = new JTextField();
		tf3.setText("0");
		tf3.setBounds(179, 133, 86, 20);
		panel.add(tf3);
		tf3.setColumns(10);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDrink.setBounds(21, 187, 46, 14);
		panel.add(lblDrink);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea", "Coffee", "Juice"}));
		cb1.setBounds(10, 212, 81, 20);
		panel.add(cb1);
		
		JLabel lblNewLabel = new JLabel("Qty");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(184, 187, 46, 14);
		panel.add(lblNewLabel);
		
		tf4 = new JTextField();
		tf4.setText("0");
		tf4.setBounds(179, 212, 86, 20);
		panel.add(tf4);
		tf4.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Home delivery");
		rb1.setBounds(4, 247, 109, 23);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Tax");
		rb2.setBounds(149, 247, 109, 23);
		panel.add(rb2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 232, 170));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(384, 61, 195, 277);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Convert", "DOLLER$", "Japan Yen"}));
		cb2.setBounds(44, 27, 67, 20);
		panel_1.add(cb2);
		
		tf8 = new JTextField();
		tf8.setBounds(41, 80, 86, 20);
		panel_1.add(tf8);
		tf8.setColumns(10);
		
		JButton btnConvert = new JButton("convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float amt=Float.parseFloat(tf7.getText());
				float result=0;
				//String st1=cb1.getSelectedItem().toString();
				if(cb2.getSelectedItem()=="DOLLER$")
		        {
		            result = (amt * 0.014f);
		            tf8.setText("$ "+result);
		        }
				   if(cb2.getSelectedItem()=="Japan Yen")
			        {
			            result = (amt * 1.51f);
			            tf8.setText(""+result);
			        }
			}
		});
		btnConvert.setBounds(10, 174, 88, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf8.setText(null);
				cb2.setSelectedIndex(0);
				
			}
		});
		btnClose.setBounds(108, 174, 77, 23);
		panel_1.add(btnClose);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 232, 170));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(10, 361, 364, 148);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(29, 25, 113, 14);
		panel_2.add(lblCostOfDrinks);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setBounds(211, 22, 86, 20);
		panel_2.add(tf5);
		tf5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" Cost of Meal");
		lblNewLabel_1.setBounds(24, 65, 105, 14);
		panel_2.add(lblNewLabel_1);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setBounds(211, 62, 86, 20);
		panel_2.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setEditable(false);
		tf7.setBounds(211, 93, 86, 20);
		panel_2.add(tf7);
		tf7.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cost of delivery");
		lblNewLabel_2.setBounds(29, 96, 113, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(238, 232, 170));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(384, 361, 195, 148);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setBounds(10, 30, 64, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 73, 64, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 108, 64, 14);
		panel_3.add(lblTotal);
		
		tf9 = new JTextField();
		tf9.setEditable(false);
		tf9.setBounds(99, 27, 86, 20);
		panel_3.add(tf9);
		tf9.setColumns(10);
		
		tf10 = new JTextField();
		tf10.setEditable(false);
		tf10.setBounds(99, 70, 86, 20);
		panel_3.add(tf10);
		tf10.setColumns(10);
		
		tf11 = new JTextField();
		tf11.setEditable(false);
		tf11.setBounds(99, 105, 86, 20);
		panel_3.add(tf11);
		tf11.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(238, 232, 170));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 520, 569, 74);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String s1=tf1.getText();
				int qtyckb=Integer.parseInt(s1);
				String s2=tf2.getText();
				int qtycmb=Integer.parseInt(s2);
				String s3=tf3.getText();
				int qtychb=Integer.parseInt(s3);
				String s4=cb1.getSelectedItem().toString();
				String s5=tf4.getText();
				int qty=Integer.parseInt(s5);
				float hdc=0;
				float drinkc=0;
				float mealc=qtyckb*ckb+qtycmb*cmb+qtychb*chb;
				float dtax=0;
				float ftax=0;
				ftax=10*qtyckb+18*qtycmb+12*qtychb;
				float subt=0;
				if(rb1.isSelected())
				{
				hdc=20;
				}
				
				if(s4.equals("Tea"))
				{
					drinkc=tea*qty;
					dtax=3;
				}
				if(s4.equals("Coffee"))
				{
					drinkc=cof*qty;
					dtax=1;
				}
				if(s4.equals("Juice"))
				{
					drinkc=juice*qty;
					dtax=4;
				}
				if(rb2.isSelected())
				{
				tax=ftax+dtax;
				}
				else
				{
					tax=0;
				}
					subt=hdc+drinkc+mealc;
				tf5.setText(String.valueOf(drinkc));
				tf6.setText(String.valueOf(mealc));
				tf7.setText(String.valueOf(hdc));
				tf9.setText(String.valueOf(tax));
				tf10.setText(String.valueOf(subt));
				tf11.setText(String.valueOf(tax+subt));
			}
			
		});
		btnTotal.setBounds(10, 23, 89, 23);
		panel_5.add(btnTotal);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf1.setText("0");
				tf2.setText("0");
				tf3.setText("0");
				tf4.setText("0");
				tf5.setText(null);
				tf6.setText(null);
				tf7.setText(null);
				tf8.setText(null);
				tf9.setText(null);
				tf10.setText(null);	
				tf11.setText(null);
				tf12.setText(null);
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				rb1.setSelected(false);
				rb2.setSelected(false);
			}
			
		});
		btnReset.setBounds(208, 23, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
			        if(confirmed == JOptionPane.YES_OPTION)
			        {
			        	System.exit(0);
			            //dispose();
			        }
				
			}
		});
		btnNewButton_1.setBounds(333, 23, 89, 23);
		panel_5.add(btnNewButton_1);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setForeground(new Color(255, 255, 0));
		lblHotelManagementSystem.setBackground(new Color(240, 248, 255));
		lblHotelManagementSystem.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblHotelManagementSystem.setBounds(235, 11, 404, 43);
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tabbedPane.setBounds(615, 61, 317, 521);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(238, 232, 170));
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textarea = new JTextArea();
		textarea.setBackground(new Color(255, 250, 240));
		textarea.setBounds(10, 31, 288, 422);
		panel_7.add(textarea);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(238, 232, 170));
		tabbedPane.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		tf12 = new JTextField();
		tf12.setBounds(10, 11, 192, 28);
		panel_4.add(tf12);
		tf12.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st1=tf12.getText();
				tf12.setText("");
				op="add";
			}
			
		});
		button.setBounds(172, 75, 50, 40);
		panel_4.add(button);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st1=tf12.getText();
				tf12.setText("");
				op="sub";
			}
		});
		btnNewButton_2.setBounds(172, 126, 50, 40);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st1=tf12.getText();
				tf12.setText("");
				op="div";
			}
		});
		btnNewButton_4.setBounds(171, 222, 50, 40);
		panel_4.add(btnNewButton_4);
		
			
			JButton b1 = new JButton("1");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b1.getText()));
				}
			});
			b1.setBounds(12, 222, 50, 40);
			panel_4.add(b1);
			
			JButton b2 = new JButton("2");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b2.getText()));
				}
			});
			b2.setBounds(62, 222, 50, 40);
			panel_4.add(b2);
			
			JButton b3 = new JButton("3");
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b3.getText()));
				}
			});
			b3.setBounds(112, 222, 49, 40);
			panel_4.add(b3);
			
			JButton b4 = new JButton("4");
			b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b4.getText()));
				}
			});
			b4.setBounds(10, 171, 50, 40);
			panel_4.add(b4);
			
			JButton b5 = new JButton("5");
			b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b5.getText()));
				}
			});
			b5.setBounds(60, 171, 50, 40);
			panel_4.add(b5);
			
			JButton b6 = new JButton("6");
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b6.getText()));
				}
			});
			b6.setBounds(112, 171, 50, 40);
			panel_4.add(b6);
			
			JButton b7 = new JButton("7");
			b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b7.getText()));
				}
			});
			b7.setBounds(12, 126, 50, 40);
			panel_4.add(b7);
			
			JButton b8 = new JButton("8");
			b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b8.getText()));
				}
			});
			b8.setBounds(62, 126, 50, 40);
			panel_4.add(b8);
			
			JButton b9 = new JButton("9");
			b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b9.getText()));
				}
			});
			b9.setBounds(111, 126, 50, 40);
			panel_4.add(b9);
			
			JButton b0 = new JButton("0");
			b0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(c==1)
					{
						tf12.setText("");
						c=0;
						dc=0;
					}
					tf12.setText(tf12.getText().concat(b0.getText()));
					
				}
			});
			b0.setBounds(10, 271, 50, 40);
			panel_4.add(b0);
			
			JButton bpoint = new JButton(".");
			bpoint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(c==1)
					{
					tf12.setText("");
					c=0;
					dc=0;
					}
					if(dc==0)
					{
					tf12.setText(tf12.getText().concat(bpoint.getText()));
					dc=1;
					}
				}
			});
			
			
			JButton button_1 = new JButton("=");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					  c=1;
						 st2=tf12.getText();
						 float res;
						 String result;
						 float ip1=Float.parseFloat(st1);
						 float ip2=Float.parseFloat(st2);
						 if(op.equals("add"))
						 {
							 res=ip1+ip2;
							 result=String.valueOf(res);
							 tf12.setText(result);
							
						 }
						 if(op.equals("sub"))
						 {
							 res=ip1-ip2;
							 result=String.valueOf(res);
							 tf12.setText(result);
						 }
						 if(op.equals("mul"))
						 {
							 res=ip1*ip2;
							 result=String.valueOf(res);
							 tf12.setText(result);
						 }
						
						 if(op.equals("div"))
						 {
							 if(ip2==0)
							 {
								 tf12.setText("not defined");
							 }
							 else
							 {
							 res=ip1/ip2;
							 result=String.valueOf(res);
							 tf12.setText(result);
							 
						 }
						 }
					
					
				}
			});
			button_1.setBounds(177, 271, 50, 40);
			panel_4.add(button_1);
			bpoint.setBounds(62, 271, 50, 40);
			panel_4.add(bpoint);
			
			JButton btnNewButton_13 = new JButton("...");
			btnNewButton_13.setBounds(112, 271, 50, 40);
			panel_4.add(btnNewButton_13);
			
			JButton btnNewButton_14 = new JButton("B");
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_14.setBounds(10, 75, 50, 40);
			panel_4.add(btnNewButton_14);
			
			JButton btnNewButton_15 = new JButton("C");
			btnNewButton_15.setBounds(62, 75, 50, 40);
			panel_4.add(btnNewButton_15);
			
			JButton btnNewButton_16 = new JButton("...");
			btnNewButton_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_16.setBounds(112, 75, 50, 40);
			panel_4.add(btnNewButton_16);
			
			JButton btnNewButton_3 = new JButton("*");
			btnNewButton_3.setBounds(171, 171, 50, 40);
			panel_4.add(btnNewButton_3);
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					st1=tf12.getText();
					tf12.setText("");
					op="mul";
				}
				
			});
		JButton btnNewButton = new JButton("Receipt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=tf1.getText();
				int qtyckb=Integer.parseInt(s1);
				float p1=qtyckb*150;
				String s2=tf2.getText();
				int qtycmb=Integer.parseInt(s2);
				float p2=qtycmb*200;
				String s3=tf3.getText();
				int qtychb=Integer.parseInt(s3);
				float p3=qtychb*130;
				String s4=cb1.getSelectedItem().toString();
				String s5=tf4.getText();
				String s6=cb1.getSelectedItem().toString();
				String s7=tf4.getText();
				int qty=Integer.parseInt(s7);
				float p=0;
				if(s4.equals("Tea"))
				{
					p=tea;
				}
				if(s4.equals("Coffee"))
				{
					p=cof;
				
				}
				if(s4.equals("Juice"))
				{
				p=juice;
				}
				int k=5474;
						textarea.append("\n \tHotel Bill \n"
						 +"billno:"+k+"\n"
						 + "item \tQuantity\tPrice"+"\n"
						 + "======================================\n"
						 + "ck burger:\t" +tf1.getText()+"\t"+String.valueOf(p1)
						 + "\nckm burger:\t" + tf2.getText()+"\t"+String.valueOf(p2)
						 + "\nch burger \t" + tf3.getText()+"\t"+String.valueOf(p3)
						 + "\n"+s6+"\t"+String.valueOf(qty)+"\t"+String.valueOf(p*qty)
						 +"\n======================================"
						 + "\nSubTotal:\t" + tf10.getText()
						 + "\nTax:\t" + tf9.getText()
						 + "\nTotal:\t" + tf11.getText()
						 +"\n\n\t***Thank You***"
						 +"\n\t***Visit Again***"
						 + "\n"
						 );
				k++;
			}
		});
		btnNewButton.setBounds(109, 23, 89, 23);
		panel_5.add(btnNewButton);
		
		
	}
}
