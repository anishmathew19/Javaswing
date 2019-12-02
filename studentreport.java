package sampleswing;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class studentreport {

	private JFrame frame;
	private JTextField stdid;
	private JTextField sname;
	private JTextField fname;
	private JTextField tot;
	private JTextField average;
	private JTextField ranking;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField sub4;
	private JTextField sub5;
	private JTextField sub6;
	private JTextField sub7;
	private JTextField sub8;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentreport window = new studentreport();
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
	public studentreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(135, 206, 250));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 748, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 321, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(10, 22, 57, 14);
		panel.add(lblStudentId);
		
		stdid = new JTextField();
		stdid.setBounds(77, 19, 86, 20);
		panel.add(stdid);
		stdid.setColumns(10);
		
		JLabel lblSurename = new JLabel("Surename");
		lblSurename.setBounds(10, 89, 57, 14);
		panel.add(lblSurename);
		
		sname = new JTextField();
		sname.setBounds(77, 83, 86, 20);
		panel.add(sname);
		sname.setColumns(10);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(10, 52, 57, 14);
		panel.add(lblFirstname);
		
		fname = new JTextField();
		fname.setBounds(77, 52, 86, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setBounds(10, 114, 67, 14);
		panel.add(lblCourseCode);
		
		JComboBox coursecode = new JComboBox();
		coursecode.setModel(new DefaultComboBoxModel(new String[] {"Select item", "101A", "102B", "103C", "104D"}));
		coursecode.setBounds(87, 114, 76, 20);
		panel.add(coursecode);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(5, 167, 72, 14);
		panel.add(lblTotalScore);
		
		tot = new JTextField();
		tot.setEditable(false);
		tot.setBounds(77, 164, 86, 20);
		panel.add(tot);
		tot.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Avg");
		lblNewLabel.setBounds(21, 204, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setBounds(21, 229, 46, 14);
		panel.add(lblRank);
		
		average = new JTextField();
		average.setEditable(false);
		average.setBounds(77, 195, 86, 20);
		panel.add(average);
		average.setColumns(10);
		
		ranking = new JTextField();
		ranking.setEditable(false);
		ranking.setBounds(77, 226, 86, 20);
		panel.add(ranking);
		ranking.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(173, 22, 46, 14);
		panel.add(lblMaths);
		
		sub1 = new JTextField();
		sub1.setBounds(220, 19, 86, 20);
		panel.add(sub1);
		sub1.setColumns(10);
		
		JLabel lblE = new JLabel("English");
		lblE.setBounds(173, 52, 46, 14);
		panel.add(lblE);
		
		JLabel lblNewLabel_1 = new JLabel("Biology");
		lblNewLabel_1.setBounds(173, 83, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(173, 114, 46, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(173, 151, 46, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(173, 176, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(173, 204, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(162, 239, 57, 14);
		panel.add(lblMalayalam);
		
		sub2 = new JTextField();
		sub2.setBounds(220, 49, 86, 20);
		panel.add(sub2);
		sub2.setColumns(10);
		
		sub3 = new JTextField();
		sub3.setBounds(220, 83, 86, 20);
		panel.add(sub3);
		sub3.setColumns(10);
		
		sub4 = new JTextField();
		sub4.setBounds(220, 111, 86, 20);
		panel.add(sub4);
		sub4.setColumns(10);
		
		sub5 = new JTextField();
		sub5.setBounds(220, 148, 86, 20);
		panel.add(sub5);
		sub5.setColumns(10);
		
		sub6 = new JTextField();
		sub6.setBounds(220, 173, 86, 20);
		panel.add(sub6);
		sub6.setColumns(10);
		
		sub7 = new JTextField();
		sub7.setBounds(220, 201, 86, 20);
		panel.add(sub7);
		sub7.setColumns(10);
		
		sub8 = new JTextField();
		sub8.setBounds(220, 236, 86, 20);
		panel.add(sub8);
		sub8.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 145, 160, 29);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(341, 11, 353, 319);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 11, 308, 257);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(189, 183, 107));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(109, 285, 89, 23);
		panel_1.add(btnClear);
		
		table = new JTable();
		table.setBackground(new Color(250, 250, 210));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student ID", "Course Name", "Maths", "English", "Biology", "Computer Science", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"Student ID", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 400, 712, 38);
		frame.getContentPane().add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.setForeground(new Color(144, 238, 144));
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				String id=stdid.getText();
				String course_code=(String)coursecode.getSelectedItem();
				String s1=sub1.getText();
				String s2=sub2.getText();
				String s3=sub3.getText();
				String s4=sub4.getText();
				String s5=sub5.getText();
				String s6=sub6.getText();
				String s7=sub7.getText();
				String s8=sub8.getText();
				float m1=Float.parseFloat(s1);
				float m2=Float.parseFloat(s2);
				float m3=Float.parseFloat(s3);
				float m4=Float.parseFloat(s4);
				float m5=Float.parseFloat(s5);
				float m6=Float.parseFloat(s6);
				float m7=Float.parseFloat(s7);
				float m8=Float.parseFloat(s8);
				float total=(float)(m1+m2+m3+m4+m5+m6+m7+m8);
				float avg=(float)(total/8);
				String rank;
				if(total>=700)
				{
				rank="1";
				}
				else if(total>=600&&total<700) {
				rank="2";
				}
				else if(total>=500&&total<600) {
				rank="3";
				}
				else if(total>=400&&total<500) {
				 rank="4";
				}
				else  {
				rank="Fail";
				}
				String  stotal=String.valueOf(total);
				String savg=String.valueOf(avg);

				String[] row = { id, course_code, s1, s2,s3, s4, s5, s6, s7, s8, stotal, savg, rank};
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				   model.addRow(row);
				   tot.setText(stotal);
				   average.setText(savg);
				   ranking.setText(rank);
				
				
			}
		
		});
		btnAddReport.setBackground(new Color(60, 179, 113));
		btnAddReport.setBounds(83, 478, 102, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(255, 69, 0));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()>0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}

				/*int row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow( row );*/
			
			}
		});
		btnDelete.setBounds(195, 478, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.setBackground(new Color(255, 140, 0));
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*int row =table.getSelectedRow();
				 String str1 =(String)table.getValueAt(row,0);
				 String str2 =(String)table.getValueAt(row,1);
				 String str3 =(String)table.getValueAt(row,2);
				 String str4 =(String)table.getValueAt(row,3);
				 String str5 =(String)table.getValueAt(row,4);
				 String str6 =(String)table.getValueAt(row,5);
				 String str7 =(String)table.getValueAt(row,6);
				 String str8 =(String)table.getValueAt(row,7);
				 String str9 =(String)table.getValueAt(row,8);
				 String str10 =(String)table.getValueAt(row,9);*/
				 textArea.append("\nStudent Record\n"
						 + "Student Name :\t\t"+fname.getText()+" "+sname.getText()+"\n"
						 + "======================================\n"
						 + "Math:\t\t" + sub1.getText()
						 + "\nEnglish:\t\t" + sub2.getText()
						 + "\nBiology:\t\t" + sub3.getText()
						 + "\nComputer:\t\t" + sub4.getText()
						 + "\nChemistry:\t\t" + sub5.getText()
						 + "\nPysics:\t\t" + sub6.getText()
						 + "\nTamil:\t\t" + sub7.getText()
						 + "\nMalayalam:\t\t" + sub8.getText()
						 +"\n======================================"
						 + "\nTotal SCore:\t\t" + tot.getText()
						 + "\nAverage:\t\t" + average.getText()
						 + "\nRanking:\t\t" + ranking.getText() + "\n"
						 );
				 
				 
				
			}
		});
		btnShowReport.setBounds(304, 478, 94, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(144, 238, 144));
		btnExit.setForeground(new Color(255, 255, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnExit.setBounds(408, 478, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(233, 150, 122));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fname.setText("");
				sname.setText("");
				tot.setText("");
				sub1.setText("");
				stdid.setText("");
				coursecode.setSelectedIndex(0);
				average.setText("");
				ranking.setText("");
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				
				sub4.setText("");
				sub5.setText("");
				sub6.setText("");
				sub6.setText("");
				sub7.setText("");
				sub8.setText("");
				
				
				
				
			}
		});
		btnReset.setBounds(524, 478, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
