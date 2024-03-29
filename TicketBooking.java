package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TicketBooking {

	private JFrame frame;
	private JTextField tf1;
	private JTable table;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField aa;
	private JTextField bb;
	String ss;
	String ac;
	int ticketno=56473;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(195, 11, 312, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblTicketBooking.setBounds(55, 11, 247, 36);
		panel.add(lblTicketBooking);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 206, 209));
		panel_1.setBounds(319, 95, 386, 281);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(20, 25, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		tf5 = new JTextField();
		tf5.setBounds(86, 23, 86, 20);
		panel_1.add(tf5);
		tf5.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(20, 72, 46, 14);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(20, 111, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(20, 156, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTme = new JLabel("Time");
		lblTme.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTme.setBounds(20, 196, 46, 14);
		panel_1.add(lblTme);
		
		tf6 = new JTextField();
		tf6.setBounds(86, 70, 86, 20);
		panel_1.add(tf6);
		tf6.setColumns(10);
		
		tf7 = new JTextField();
		tf7.setBounds(86, 109, 86, 20);
		panel_1.add(tf7);
		tf7.setColumns(10);
		
		tf8 = new JTextField();
		tf8.setBounds(86, 154, 86, 20);
		panel_1.add(tf8);
		tf8.setColumns(10);
		
		tf9 = new JTextField();
		tf9.setBounds(86, 194, 86, 20);
		panel_1.add(tf9);
		tf9.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket No");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(276, 73, 56, 14);
		panel_1.add(lblNewLabel_4);
		
		tf10 = new JTextField();
		tf10.setBounds(276, 92, 86, 20);
		panel_1.add(tf10);
		tf10.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(276, 130, 46, 14);
		panel_1.add(lblPrice);
		
		tf11 = new JTextField();
		tf11.setBounds(276, 154, 86, 20);
		panel_1.add(tf11);
		tf11.setColumns(10);		
		JLabel lblNewLabel_5 = new JLabel("Route");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(286, 183, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		tf12 = new JTextField();
		tf12.setBounds(276, 208, 86, 20);
		panel_1.add(tf12);
		tf12.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=tf5.getText();
				String s2=tf10.getText();
				String s3=tf6.getText();
				String s4=tf7.getText();
				String s5=ss;
				String s6=tf9.getText();
				String s7=tf8.getText();
				String s8=ac;
				String s9=tf8.getText();
				
				String[] row = {s1,s2,s3,s4,s5,s6,s7,s8,s9};
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				   model.addRow(row);
				   ticketno++;
			}
		});
		btnConfirm.setBounds(175, 233, 89, 23);
		panel_1.add(btnConfirm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 94, 46, 14);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblName);
		
		tf1 = new JTextField();
		tf1.setBackground(new Color(250, 235, 215));
		tf1.setBounds(83, 92, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 171, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 171, 160, -5);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(10, 127, 271, 2);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rb1 = new JRadioButton("Standard");
		rb1.setBounds(6, 136, 86, 23);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Single Ticket");
		rb2.setBounds(94, 136, 107, 23);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Adult");
		rb3.setBounds(203, 136, 68, 23);
		rb3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(rb3);
		
		JRadioButton rb4 = new JRadioButton("First Class");
		rb4.setBounds(6, 171, 86, 23);
		rb4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("AC");
		rb5.setBounds(104, 173, 46, 23);
		rb5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(rb5);
		
		JRadioButton rb6 = new JRadioButton("Sleeper");
		rb6.setBounds(152, 171, 68, 23);
		rb6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(rb6);
		
		JRadioButton rb7 = new JRadioButton("Child");
		rb7.setBounds(217, 171, 53, 23);
		rb7.setFont(new Font("Tahoma", Font.PLAIN, 13));
       ButtonGroup seat = new ButtonGroup();
		seat.add(rb5);
		seat.add(rb6);
		seat.add(rb4);
		 ButtonGroup first = new ButtonGroup();
		 first.add(rb1);
		 first.add(rb2);
		 first.add(rb3);
		 first.add(rb7);
		
		frame.getContentPane().add(rb7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(106, 90, 205));
		panel_2.setBounds(10, 430, 685, 95);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "BookinNumber", "From", "To ", "No.of seats", "Time", "Date", "AC/NonAC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(0, 11, 685, 73);
		panel_2.add(table);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBackground(new Color(0, 0, 0));
		separator_3.setBounds(10, 232, 262, 8);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 281, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setBounds(115, 279, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Subtotal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 321, 61, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 359, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setBounds(115, 322, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setBounds(115, 353, 86, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"From", "TVM", "EKM", "KZD"}));
		cb1.setBounds(10, 201, 71, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"To", "TVM", "EKM", "KZD"}));
		cb2.setBounds(94, 203, 75, 20);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"Seats", "1", "2", "3"}));
		cb3.setBounds(203, 201, 68, 20);
		frame.getContentPane().add(cb3);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float tax=0;
				float price=0;				
				String fr = cb1.getSelectedItem().toString();
				String to = cb2.getSelectedItem().toString();
				if(fr.equals("KZD")&& to.equals("EKM")||fr.equals("EKM")&& to.equals("KZD"))
				{
				price=200;
				
				}
				if(fr.equals("KZD")&& to.equals("TVM")||fr.equals("TVM")&& to.equals("KZD"))
				{
				price=300;
				}

				if(fr.equals("EKM")&& to.equals("TVM")||fr.equals("TVM")&& to.equals("EKM"))
				{
				price=100;
				
				}
				
		
				if(rb4.isSelected())
				{			
				 price=price+((price*10)/100);
				 tax=(price*20)/100;
				
					ac="NonAC";

				}
				if(rb5.isSelected())
				{
				
				 price=price+(price*30)/100;
				tax=(price*30)/100;
				ac="AC";

				}
				if(rb6.isSelected())
				{
			
				 price=price+(price*20)/100;
				tax=(price*10)/100;
				ac="NonAC";

				}
				String str2=(String)cb3.getSelectedItem();
				float seat=Float.parseFloat(str2);
				ss=String.valueOf(seat);
				float subtotal=(seat*price);
				float ttax=seat*tax;
				float total=subtotal+ttax;
				String subt=String.valueOf(subtotal);
				String tot=String.valueOf(total);
				String totaltax=String.valueOf(ttax);
				tf2.setText(totaltax);
				tf3.setText(subt);
				tf4.setText(tot);
				tf5.setText(tf1.getText());
				tf6.setText((String)cb1.getSelectedItem());
				tf7.setText((String)cb2.getSelectedItem());
				tf10.setText(String.valueOf(ticketno));
				tf11.setText(tot);
				tf8.setText("11/23/2019");
				tf9.setText("13:00");
				
				tf12.setText("Any");				
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(10, 396, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
				tf9.setText("");	
				tf10.setText("");
				tf11.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				first.clearSelection();
				seat.clearSelection();
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(104, 396, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
			        if(confirmed == JOptionPane.YES_OPTION)
			        {
			        	System.exit(0);
			            //dispose();
			        }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(213, 396, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBounds(298, 123, 1, 234);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(new Color(0, 0, 0));
		separator_5.setBackground(new Color(0, 0, 0));
		separator_5.setBounds(298, 123, -16, 238);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(new Color(0, 0, 0));
		separator_6.setForeground(new Color(0, 0, 0));
		separator_6.setBounds(10, 384, 271, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(new Color(0, 0, 0));
		separator_7.setBackground(new Color(0, 0, 0));
		separator_7.setBounds(277, 123, 11, 262);
		frame.getContentPane().add(separator_7);
		
		aa = new JTextField();
		aa.setBounds(61, 251, 86, 20);
		frame.getContentPane().add(aa);
		aa.setColumns(10);
		
		bb = new JTextField();
		bb.setBounds(161, 251, 86, 20);
		frame.getContentPane().add(bb);
		bb.setColumns(10);
	}
}
