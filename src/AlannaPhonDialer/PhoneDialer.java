package AlannaPhonDialer;
/*
 * Alanna Botscharow
 * 12/21
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PhoneDialer implements ActionListener{

	public void actionPerformed(ActionEvent e) {
	//Check if the user clicked a button
		if (e.getSource()== dialButton) {
			JOptionPane.showMessageDialog(null, "Dialing: " + phoneNumber);
			
			//reset phone number
			phoneNumber = ""; 
			
		}
		//other buttons
		else if (e.getSource() == button1);{
			phoneNumber = phoneNumber + "1";
			
		}
		else if (e.getSource() == button2);{
			phoneNumber = phoneNumber + "2";
			
		}
		else if (e.getSource() == button3);{
			phoneNumber = phoneNumber + "3";
			
		}
		else if (e.getSource() == button4);{
			phoneNumber = phoneNumber + "4";
			
		}
		else if (e.getSource() == button5);{
			phoneNumber = phoneNumber + "5";
			
		}
		else if (e.getSource() == button6);{
			phoneNumber = phoneNumber + "6";
			
		}
		else if (e.getSource() == button7);{
			phoneNumber = phoneNumber + "7";
			
		}
		else if (e.getSource() == button8);{
			phoneNumber = phoneNumber + "8";
			
		}
		else if (e.getSource() == button9);{
			phoneNumber = phoneNumber + "9";
			
		}
		else if (e.getSource() == button0);{
			phoneNumber = phoneNumber + "0";
			
		}
		else if (e.getSource() == buttonDash);{
			phoneNumber = phoneNumber + "-";
			
		}
		
	}
	//Declare all of the variables.
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonDash;
	JButton button0;
	JButton dialButton;
	
	String phoneNumber;
	
	public static void main(String[] args) {
		new PhoneDialer();
	}
	
	public PhoneDialer() {
		
		//initialize the dialed number to the empty string.
		phoneNumber = "";
		
		
		//Create a new JFrame.
		JFrame myFrame = new JFrame(); 
		myFrame.setTitle("Dialer");
		myFrame.setSize(200,500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Get the main content pain. 
		JPanel mainPanel = (JPanel)myFrame.getContentPane(); 
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		
		//Create panel for the top label
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new FlowLayout());
		JLabel myLabel = new JLabel("Enter the number to dial: ");
		labelPanel.add(myLabel);
		
		//Create panel to hold the phone buttons.
		JPanel buttonPanel = new JPanel(); 
		buttonPanel.setLayout(new GridLayout(4,3,5,5));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		//Create all of the buttons
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonDash = new JButton("-");
		button0 = new JButton("0");
		
		//Add buttons to the grid
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonDash);
		buttonPanel.add(button0);
		
		
		//Add the top label panel and middle button panel.
		mainPanel.add(labelPanel);
		mainPanel.add(buttonPanel); 
		
		
		//Create a dial button.
		dialButton = new JButton("Dial Number"); 
		dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(dialButton);
		
		
		//Add "this"
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonDash.addActionListener(this);
		dialButton.addActionListener(this);
		
		
		//Make the frame visible.
		myFrame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
