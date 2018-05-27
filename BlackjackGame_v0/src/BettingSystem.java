
public class BettingSystem {
	private double accountAmount, betAmount;
	
	public BettingSystem()
	{
		accountAmount = 1000;
	}
	
	private void SetAccountAmount(double newAccountAmount)
	{
		this.accountAmount = newAccountAmount;
	}
	public double GetAccountAmount()
	{
		return this.accountAmount;
	}
	
	public void SetBetAmount(double betAmount)
	{
		this.betAmount = this.GetBetAmount() + betAmount;
	}
	
	public double GetBetAmount()
	{
		return this.betAmount;
	}
	
	public boolean IsBettingAmountSet()
	{
		if (this.GetBetAmount() > 0)
			return true;
		else
			return false;
	}
	public void ClearBetAmount()
	{
		this.betAmount = 0;
	}
	
	public void HandlePlayerLoss()
	{
		this.SetAccountAmount(this.GetAccountAmount()-this.GetBetAmount());
	}
	
	public void HandlePlayerWin()
	{
		this.SetAccountAmount(this.GetAccountAmount()+this.GetBetAmount());
	}
	
	public void HandleBlackjack()
	{
		this.SetAccountAmount(this.GetAccountAmount()+(this.GetBetAmount()*1.5));
	}
}
