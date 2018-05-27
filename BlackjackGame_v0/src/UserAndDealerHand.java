import java.util.Vector;
import java.awt.Color;
import java.util.Random;
import javax.swing.JTextField;

public class UserAndDealerHand {

	
	private Vector<JTextField> vectorOfTextFields;
	private int counter;
	private int userHandSum, dealerHandSum;
	private JTextField textFieldHolder;
	private boolean aceFlag, dealerAceFlag, gameController = false, blackjack = false;
	
	public void SetUserHandSum(int newCardValue)
	{
		int currentSum = GetUserHandSum();
		this.userHandSum = currentSum + newCardValue;
	}
	
	public int GetUserHandSum()
	{
		return this.userHandSum;
	}
	
	public void SetDealerHandSum(int newCardValue)
	{
		int currentSum = GetDealerHandSum();
		this.dealerHandSum = currentSum + newCardValue;
	}
	
	public int GetDealerHandSum()
	{
		return this.dealerHandSum;
	}
	
	// constructor
	public UserAndDealerHand()
	{
		this.counter = 0;
		this.userHandSum = 0;
		this.dealerHandSum = 0;
		vectorOfTextFields = new Vector<JTextField>(12);
	}
	
	
	// Returns the vector of Text Fields
	public Vector<JTextField> GetVectorOfTextFields() 
	{
		return vectorOfTextFields;
	}
	
	public void SetVectorOfTextFields(Vector<JTextField> vector)
	{
		vectorOfTextFields.removeAllElements();
		
		for (int i = 0; i < vector.size(); i++)
		{
			vectorOfTextFields.add(vector.get(i));
		}
	}
	
	// Obtain the counter
	public int GetCounter()
	{
		return counter;
	}
	
	// Set the counter to passed value
	public void SetCounter(int count)
	{
		this.counter = count;
	}
	
	
	// Increment the counter
	public void IncrementCounter()
	{
		this.counter++;
	}
	
	
	public void ResetCards()
	{
		this.counter = 0;
		this.userHandSum = 0;
		this.dealerHandSum = 0;
		this.aceFlag = false;
		this.dealerAceFlag = false;
		for (int i = 0; i < vectorOfTextFields.size(); i++)
		{
			JTextField textField = vectorOfTextFields.get(i);
			textField.setText("");
		}
		
	}
	
	
	
	// Sets the text field holder for setting card values of each text field
	public void SetTextFieldHolder(JTextField textField)
	{
		this.textFieldHolder = textField;
	}
	
	// Get the current text field
	public JTextField GetTextFieldHolder()
	{
		return this.textFieldHolder;
	}
	
	
	// Generate the face value for the incoming card
	public String CardFaceValue(int cardValue)
	{
		switch (cardValue) {

		case 1: {
			return "A";
		}

		case 2: {
			return "2";
		}
		case 3: {
			return "3";
		}
		case 4: {
			return "4";
		}
		case 5: {
			return "5";
		}
		case 6: {
			return "6";
		}
		case 7: {
			return "7";
		}
		case 8: {
			return "8";
		}
		case 9: {
			return "9";
		}
		case 10: {
			return "10";
		}
		case 11: {
			cardValue = 10;
			return "J";
		}
		case 12: {
			cardValue = 10;
			return "Q";
		}
		case 13: {
			cardValue = 10;
			return "K";
		}
		default: {
			int temp = GenerateCardValue();
			return CardFaceValue(temp);
		}
		}
	}
	
	
	// Generate the value for the card
	public int GenerateCardValue()
	{
		Random rand = new Random();
		int cardValue = rand.nextInt(13) + 1;
		if (cardValue == 1)
		{
			if (this.counter < 6)
				SetAceFlag(true);
			else
				SetDealerAceFlag(true);
		}
		return cardValue;
	}
	
	
	// Return the color of the card
	public void RedOrBlack(JTextField textField) {
		Random rand = new Random();
		int temp = rand.nextInt(52) + 1;
		
		if (temp % 2 == 0)
			textField.setForeground(Color.RED);
		else
			textField.setForeground(Color.BLACK);
	}
	
	
	public boolean GetAceFlag()
	{
		return this.aceFlag;
	}
	
	public void SetAceFlag(boolean incomingFlag)
	{
		this.aceFlag = incomingFlag;
	}
	
	public boolean GetDealerAceFlag()
	{
		return this.dealerAceFlag;
	}
	
	public void SetDealerAceFlag(boolean incomingFlag)
	{
		this.dealerAceFlag = incomingFlag;
	}
	
	public boolean GetGameController()
	{
		return this.gameController;
	}
	
	public void SetGameController()
	{
		this.gameController = this.IsGameCurrentlyRunning();
	}
	
	public boolean IsGameCurrentlyRunning()
	{
		if (this.counter > 0)
			return true;
		else
			return false;
	}
	
	public void SetBlackJackMonitor(boolean isBlackjack)
	{
		if (isBlackjack)
			this.blackjack = true;
		else
			this.blackjack = false;
	}
	
	public boolean IsThereABlackjack()
	{
		return this.blackjack;
	}
	
	
}
