package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.Color;

public class noteconversion {

	private JFrame frame;
	private JTextField txtFrom;
	private JTextField txtTo;

    float input = 0;
    float result = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					noteconversion window = new noteconversion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	  
	
	public noteconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversion = new JLabel("Currency Conversion");
		lblConversion.setForeground(new Color(255, 51, 153));
		lblConversion.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		lblConversion.setBounds(144, 24, 233, 31);
		frame.getContentPane().add(lblConversion);
		
		JComboBox convertFrom = new JComboBox();
		convertFrom.setModel(new DefaultComboBoxModel(new String[] {"Select", "INR^", "DOLLER$", "Japan Yen","Thai Baht"}));
		convertFrom.setBounds(239, 76, 101, 20);
		frame.getContentPane().add(convertFrom);
		
		JComboBox convertTo = new JComboBox();
		convertTo.setModel(new DefaultComboBoxModel(new String[] {"Select", "INR^", "DOLLER$", "Japan Yen","Thai Baht"}));
		convertTo.setBounds(239, 179, 101, 20);
		frame.getContentPane().add(convertTo);
		
		JLabel lblInput = new JLabel("From");
		lblInput.setBounds(129, 79, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblAmount = new JLabel("Enter Amount to Convert:");
		lblAmount.setBounds(39, 126, 164, 14);
		frame.getContentPane().add(lblAmount);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(254, 123, 86, 20);
		frame.getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		
		JLabel lblOutput = new JLabel("To");
		lblOutput.setBounds(98, 182, 77, 14);
		frame.getContentPane().add(lblOutput);
		
		
		
		txtTo = new JTextField();
		txtTo.setBackground(new Color(204, 255, 0));
		txtTo.setBounds(268, 291, 86, 20);
		frame.getContentPane().add(txtTo);
		txtTo.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(169, 350, 89, 23);
		frame.getContentPane().add(btnExit);
		
		
		
		JButton btnConvert = new JButton("Compute");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 input = Float.parseFloat(txtFrom.getText());
				if(convertFrom.getSelectedItem()=="DOLLER$")
	            {
					
					        if(convertTo.getSelectedItem()=="DOLLER$")
					        {
					            result = (input);
					            txtTo.setText("$ "+result);
					        }
					        else if(convertTo.getSelectedItem()=="INR^")
					        {
					            result = (input * 71.78f);
					            txtTo.setText(""+result);
					        }
					       
					        else if(convertTo.getSelectedItem()=="Japan Yen")
					        {
					            result = (input * 76.7f);
					            txtTo.setText(""+result);
					        }
					        else
					        {
					            result = (input * 31.8f);
					            txtTo.setText(""+result);
					        }					      
					   
 
	            }
				else if(convertFrom.getSelectedItem()=="INR^")
	            {
	              
					 if(convertTo.getSelectedItem()=="DOLLER$")
				        {
				            result = (input * 0.014f);
				            txtTo.setText("$ "+result);
				        }
				       
				         else if(convertTo.getSelectedItem()=="Japan Yen")
				        {
				            result = (input * 1.51f);
				            txtTo.setText(""+result);
				        }
				         else if(convertTo.getSelectedItem()=="INR^")
				         {
				        	 result = (input);
				             txtTo.setText("NT$ "+result);
				         }
				        else
				        {
				            result = (input * 0.42f);
				            txtTo.setText(""+result);
				        }
				        
	            }
	           
	            else if(convertFrom.getSelectedItem()=="Japan Yen")
	            {
	            	 if(convertTo.getSelectedItem()=="DOLLER$")
	                 {
	                     result = (input * 0.013f);
	                     txtTo.setText(""+result);
	                 }
	                 else if(convertTo.getSelectedItem()=="INR^")
	                 {
	                     result = (input * 0.66f);
	                     txtTo.setText(""+result);
	                 }
	                
	                 else if(convertTo.getSelectedItem()=="Japan Yen")
	                 {
	                     result = (input);
	                     txtTo.setText(""+result);
	                 }
	                 else 
	                 {
	                     result = (input * 0.414f);
	                     txtTo.setText(""+result);
	                 }	                  
	            }
	          
	            else
	            {
	            	 if(convertTo.getSelectedItem()=="DOLLER$")
	                 {
	                     result = (input * 0.0315f);
	                     txtTo.setText("$ "+result);
	                 }
	                 else if(convertTo.getSelectedItem()=="INR^")
	                 {
	                     result = (input * 2.38f);
	                     txtTo.setText(""+result);
	                 }
	                	                 
	                 else if(convertTo.getSelectedItem()=="Japan Yen")
	                 {
	                     result = (input * 2.42f);
	                     txtTo.setText(""+result);
	                 }
	                 else 
	                 {
	                     result = (input);
	                     txtTo.setText(""+result);
	                 }
	               
	            }
				
				/*Object selectedItem1=comboBox.getSelectedItem();
				String s1=selectedItem1.toString();
				String a=tf1.getText();
				float am=Float.parseFloat(s1);
				float f1=Float.parseFloat(s1);
				Object selectedItem2=comboBox_1.getSelectedItem();
				String s2=selectedItem2.toString();
				float f2=Float.parseFloat(s2);
			
				tf1.setText(s1);
				tf2.setText(s2);*/
				
				
								 
				
			}
		});
		
		
		btnConvert.setBounds(169, 236, 89, 23);
		frame.getContentPane().add(btnConvert);
		
		JLabel lblTotalAmountConvert = new JLabel("Total amount convert to");
		lblTotalAmountConvert.setBounds(83, 294, 155, 31);
		frame.getContentPane().add(lblTotalAmountConvert);
	}
}
