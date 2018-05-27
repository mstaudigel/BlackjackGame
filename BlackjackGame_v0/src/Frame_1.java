import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private UserAndDealerHand individualHand = new UserAndDealerHand();
	private BettingSystem bettingSystem = new BettingSystem();
	private JLabel lblNewLabel_2;
	private JTextField textField_12;
	private JTextField textField_13;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_1 frame = new Frame_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1168, 892);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField.setBounds(59, 154, 86, 156);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_1.setColumns(10);
		textField_1.setBounds(155, 154, 86, 156);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_2.setColumns(10);
		textField_2.setBounds(251, 154, 86, 156);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_3.setColumns(10);
		textField_3.setBounds(347, 154, 86, 156);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_4.setColumns(10);
		textField_4.setBounds(443, 154, 86, 156);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_5.setColumns(10);
		textField_5.setBounds(539, 154, 86, 156);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_6.setColumns(10);
		textField_6.setBounds(539, 414, 86, 156);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_7.setColumns(10);
		textField_7.setBounds(443, 414, 86, 156);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_8.setColumns(10);
		textField_8.setBounds(347, 414, 86, 156);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_9.setColumns(10);
		textField_9.setBounds(251, 414, 86, 156);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_10.setColumns(10);
		textField_10.setBounds(155, 414, 86, 156);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		textField_11.setColumns(10);
		textField_11.setBounds(59, 414, 86, 156);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel = new JLabel("Dealer Hand\r\n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setBounds(216, 103, 236, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblYourHand = new JLabel("Your Hand");
		lblYourHand.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblYourHand.setBounds(236, 363, 202, 40);
		contentPane.add(lblYourHand);
		
		JButton btnNewButton = new JButton("Deal");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!individualHand.IsGameCurrentlyRunning() && bettingSystem.IsBettingAmountSet())
				{
					individualHand.ResetCards();
					SetUpGame();
			
				}
			}
		});
		btnNewButton.setBounds(10, 753, 101, 70);
		contentPane.add(btnNewButton);
		
		button = new JButton("Hit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HandleHit();
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		button.setBounds(216, 591, 101, 70);
		contentPane.add(button);
		
		button_1 = new JButton("Stay");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (individualHand.IsGameCurrentlyRunning())
					HandleStay();
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		button_1.setBounds(357, 591, 101, 70);
		contentPane.add(button_1);
		
		lblNewLabel_1 = new JLabel("Hand Total");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1.setBounds(505, 591, 106, 26);
		contentPane.add(lblNewLabel_1);
		
		label = new JLabel("0");
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		label.setBounds(527, 621, 139, 40);
		contentPane.add(label);
		
		button_2 = new JButton("$10");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bettingSystem.SetBetAmount(10);
				textField_12.setText("$" + Double.toString(bettingSystem.GetBetAmount()));
			}
		});
		button_2.setForeground(new Color(0, 128, 0));
		button_2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		button_2.setBounds(196, 753, 101, 70);
		contentPane.add(button_2);
		
		button_3 = new JButton("$25");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bettingSystem.SetBetAmount(25);
				textField_12.setText("$" + Double.toString(bettingSystem.GetBetAmount()));
			}
		});
		button_3.setForeground(new Color(0, 128, 0));
		button_3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		button_3.setBounds(307, 753, 101, 70);
		contentPane.add(button_3);
		
		button_4 = new JButton("$50");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bettingSystem.SetBetAmount(50);
				textField_12.setText("$" + Double.toString(bettingSystem.GetBetAmount()));
			}
		});
		button_4.setForeground(new Color(0, 128, 0));
		button_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		button_4.setBounds(418, 753, 101, 70);
		contentPane.add(button_4);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblNewLabel_2.setBounds(505, 335, 160, 52);
		contentPane.add(lblNewLabel_2);
		
		textField_12 = new JTextField();
		textField_12.setBounds(307, 691, 117, 40);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		textField_12.setText("$" + Double.toString(bettingSystem.GetBetAmount()));
		
		JLabel lblBetAmount = new JLabel("Bet Amount");
		lblBetAmount.setBounds(431, 717, 98, 14);
		contentPane.add(lblBetAmount);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(527, 783, 117, 40);
		contentPane.add(textField_13);
		textField_13.setText("$" + Double.toString(bettingSystem.GetAccountAmount()));
		
		
		JLabel lblYourAccount = new JLabel("Your Account");
		lblYourAccount.setBounds(550, 768, 116, 14);
		contentPane.add(lblYourAccount);
	}
	
	private void SetUpCard(boolean currentHand)
	{
		// Set text field holder
		Vector<JTextField> vectorOfTextFields = individualHand.GetVectorOfTextFields();
		individualHand.SetTextFieldHolder(vectorOfTextFields.get(individualHand.GetCounter()));
		JTextField textField = individualHand.GetTextFieldHolder();
		
		// Generate Card Value and card color
		int currentCardValue = individualHand.GenerateCardValue();
		individualHand.RedOrBlack(textField);
		textField.setText(individualHand.CardFaceValue(currentCardValue));
		
		// set face card values to 10 if they are not Aces
		if (currentCardValue > 10)
		{
			currentCardValue = 10;
		}
		
		if (currentHand == true)
		{
			individualHand.SetUserHandSum(currentCardValue);
		}
		else if (currentHand == false)
		{
			if (individualHand.GetDealerAceFlag())
			{
				int temp = (individualHand.GetDealerHandSum()+11);
				if ( temp > 17 && temp <= 21)
				{
					individualHand.SetDealerHandSum(11);
					individualHand.SetDealerAceFlag(false);
				}
				else if (temp > 21)
				{
					individualHand.SetDealerHandSum(currentCardValue);
					individualHand.SetDealerAceFlag(false);
				}
				else if (temp > 11)
				{
					individualHand.SetDealerHandSum(currentCardValue);
					individualHand.SetDealerAceFlag(false);
				}
				else
				{
					individualHand.SetDealerHandSum(temp);
					individualHand.SetDealerAceFlag(false);
				}
			}
			else
			{
				individualHand.SetDealerHandSum(currentCardValue);
				individualHand.SetDealerAceFlag(false);
			}
		}
		
	}
	
	private void SetUpGame()
	{
		if (individualHand.GetCounter() == 0)
		{
			
			this.lblNewLabel_2.setText("");
			individualHand.SetCounter(0);


			individualHand.SetBlackJackMonitor(false);
			// Reset the text field vector
			Vector<JTextField> vectorOfTextFields = individualHand.GetVectorOfTextFields();
			
			if (vectorOfTextFields.isEmpty())
			{	
				vectorOfTextFields.add(textField_11);
				vectorOfTextFields.add(textField_10);
				vectorOfTextFields.add(textField_9);
				vectorOfTextFields.add(textField_8);
				vectorOfTextFields.add(textField_7);
				vectorOfTextFields.add(textField_6);
				vectorOfTextFields.add(textField);
				vectorOfTextFields.add(textField_1);
				vectorOfTextFields.add(textField_2);
				vectorOfTextFields.add(textField_3);
				vectorOfTextFields.add(textField_4);
				vectorOfTextFields.add(textField_5);
			}
			//Set User First Card
			SetUpCard(true);
			individualHand.IncrementCounter();
			
			//Set User Second Card
			SetUpCard(true);
			PrintUserHandTotal();
			individualHand.SetCounter(6);
			
			//Set Dealer First Card
			SetUpCard(false);
			
			// Set counter to third user card position
			individualHand.SetCounter(2);
			individualHand.SetTextFieldHolder(vectorOfTextFields.get(individualHand.GetCounter()));
			
			if (individualHand.IsThereABlackjack())
			{
				individualHand.SetCounter(0);
			}
			
		}
	}
	
	// Handles the hit behavior
	private void HandleHit()
	{
		if (individualHand.GetCounter() <= 5 && individualHand.GetCounter() != 0) {
			
			Vector<JTextField> vectorOfTextFields = individualHand.GetVectorOfTextFields();

			SetUpCard(true);
			PrintUserHandTotal();
			if (individualHand.GetCounter() != 0)
			{
			individualHand.IncrementCounter();
			individualHand.SetTextFieldHolder(vectorOfTextFields.get(individualHand.GetCounter()));
			}
	
		}
	}
		
	
	private void HandleStay()
	{
		individualHand.SetCounter(7);
		
		// Handle choice of higher ace value
		if (individualHand.GetAceFlag())
		{
			individualHand.SetUserHandSum(10);
			individualHand.SetAceFlag(false);
			PrintUserHandTotal();
		}
		
		Vector<JTextField> vectorOfTextFields = individualHand.GetVectorOfTextFields();
		while (individualHand.GetDealerHandSum() < 17)
		{

			individualHand.SetTextFieldHolder(vectorOfTextFields.get(individualHand.GetCounter()));
			
			SetUpCard(false);

			individualHand.IncrementCounter();
			individualHand.SetTextFieldHolder(vectorOfTextFields.get(individualHand.GetCounter()));
			
		}
		
		DetermineResult();
		
		individualHand.SetCounter(0);
	}
	
	private void PrintUserHandTotal()
	{

		if (individualHand.GetAceFlag())
		{
			int aceSum = individualHand.GetUserHandSum() + 10;
			if (aceSum == 21 && individualHand.GetCounter() == 1)
			{
				individualHand.SetUserHandSum(21);
				this.label.setText("Blackjack!");
				individualHand.SetCounter(1);
				DetermineResult();
			}
			else if (aceSum < 21)
				this.label.setText(Integer.toString(individualHand.GetUserHandSum()) +  " or " + Integer.toString(aceSum));
			else if (aceSum > 21 && individualHand.GetUserHandSum() > 21)
			{
				DetermineResult();
			}
			else if (aceSum > 21 && individualHand.GetUserHandSum() < 21)
			{
				this.label.setText(Integer.toString(individualHand.GetUserHandSum()));
				individualHand.SetAceFlag(false);
			}
			else
				this.label.setText(Integer.toString(individualHand.GetUserHandSum()));
		}
	
		else if (individualHand.GetUserHandSum() > 21 && !individualHand.GetAceFlag())
		{
			DetermineResult();
		}
		else
		{
			this.label.setText(Integer.toString(individualHand.GetUserHandSum()));
		}
	}
	
	private void DetermineResult()
	{
		int dealerSum = individualHand.GetDealerHandSum();
		int userSum = individualHand.GetUserHandSum();
		if (userSum == 21 && individualHand.GetCounter() == 1)
		{
			this.lblNewLabel_2.setText("You Win!");
			individualHand.SetBlackJackMonitor(true);
			bettingSystem.HandleBlackjack();
		}
		
		else if (userSum > 21)
		{
			this.lblNewLabel_2.setText("You lose!");
			individualHand.SetCounter(0);
			bettingSystem.HandlePlayerLoss();
		}
		else if (userSum <= 21 && dealerSum <= 21)
		{
			if (dealerSum > userSum)
			{
				this.lblNewLabel_2.setText("You lose!");
				individualHand.SetCounter(0);
				bettingSystem.HandlePlayerLoss();
			}
			else if (dealerSum == userSum)
			{
				this.lblNewLabel_2.setText("Push");
				individualHand.SetCounter(0);
			}
			else
			{
				this.lblNewLabel_2.setText("You Win!");
				individualHand.SetCounter(0);
				bettingSystem.HandlePlayerWin();
			}
		}
		else
		{
			this.lblNewLabel_2.setText("You Win!");
			individualHand.SetCounter(0);
			bettingSystem.HandlePlayerWin();
		}

		bettingSystem.ClearBetAmount();
		textField_12.setText("$" + Double.toString(bettingSystem.GetBetAmount()));
		textField_13.setText("$" + Double.toString(bettingSystem.GetAccountAmount()));
	}
}
