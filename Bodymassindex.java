package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class Bodymassindex {

	private JFrame frame;
	private JTextField ht;
	private JTextField wt;
	private JTextField opbmi;
	private JTable table;
	private JTable table_1;

private JTable table_2;
private JTextField res;
private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymassindex window = new Bodymassindex();
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
	public Bodymassindex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 392, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(10, 57, 356, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m):");
		lblNewLabel_1.setBounds(34, 44, 74, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(Kg):");
		lblNewLabel_2.setBounds(34, 96, 74, 30);
		panel.add(lblNewLabel_2);
		
		ht = new JTextField();
		ht.setBounds(135, 49, 86, 20);
		panel.add(ht);
		ht.setColumns(10);
		
		wt = new JTextField();
		wt.setBounds(135, 101, 86, 20);
		panel.add(wt);
		wt.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(52, 155, 46, 14);
		panel.add(lblBmi);
		
		res = new JTextField();
		res.setFont(new Font("Tahoma", Font.BOLD, 13));
		res.setBackground(Color.ORANGE);
		res.setBounds(135, 152, 86, 20);
		panel.add(res);
		res.setColumns(10);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		result.setBackground(Color.YELLOW);
		result.setBounds(231, 155, 102, 17);
		panel.add(result);
		
		JButton bcal = new JButton("Calculate");
		bcal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=ht.getText();
				 String str2=wt.getText();
				  float h=Float.parseFloat(str1);
				  float w=Float.parseFloat(str2);
					//t1.setText(str1);
				  float r=(float)(w/(h*h));
				  String re=String.valueOf(r);
				  res.setText(re);
				  if(r<18.5)
				  {
					  result.setForeground(Color.YELLOW);
					  result.setText("UnderWeight");  
				  }
				  else if (r>18.5 && r<24.9)
				  {
					  result.setForeground(Color.GREEN);
					  result.setText("NormalWeight");
				  }
				  else if (r>25 && r<29.9)
				  {
					  result.setForeground(Color.ORANGE);
					  result.setText("OverWeight");
				  }
			
				  else
				  {
					  result.setForeground(Color.RED);
					  result.setText("Obese");
				  }
				
			}
		});
		bcal.setBounds(34, 193, 89, 23);
		panel.add(bcal);
		
		JButton bclear = new JButton("Clear");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ht.setText("");
			
				wt.setText("");
				res.setText("");
				result.setText("");
				
			}
		});
		bclear.setBounds(132, 193, 89, 23);
		panel.add(bclear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(244, 193, 89, 23);
		panel.add(btnExit);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(10, 305, 356, 151);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table_3 = new JTable();
		table_3.setBackground(new Color(60, 179, 113));
		table_3.setForeground(Color.BLACK);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"UnderWeight", "NormalWeight", "OverWeight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", ">30"},
			},
			new String[] {
				"", "", "", ""
			}
		));
		table_3.setBounds(10, 95, 336, 32);
		panel_1.add(table_3);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("BODY MASS INDEX");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(127, 11, 159, 35);
		frame.getContentPane().add(lblNewLabel);
	}
}
