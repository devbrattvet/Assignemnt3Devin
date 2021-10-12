
public class BankAccount {

	private double balance;
	private long accountNum;
	private String name;
	private boolean overdrawn;

	
	public BankAccount()
	{
		balance=0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public long getAccountNum()
	{
		return accountNum;
	}
	
	public void setAccountNum(long acctnum)
	{
		accountNum=acctnum;
	}
	
	public String getAccountName()
	{
		return name;
	}
	
	public void setAccountName(String acctname)
	{
		name=acctname;
	}
	
	public boolean getOverdrawn()
	{
		return overdrawn;
	}
	
	public void setOverdrawn(boolean status)
	{
		status=overdrawn;
	}
	
	public BankAccount(double initialBalance, String acctname, long acctnum, boolean status)
	{
		balance=initialBalance;
		accountNum=acctnum;
		name=acctname;
		overdrawn=status;
		
	}
	
	
	public void deposit(double amount)
	{
		balance=balance+amount;
		if(balance>=0)
		{
			overdrawn=false;
		}
	}
	
	public void withdraw(double amount)
	{
		if(balance-amount>=0)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Negative amount!");
			overdrawn=true;
		}
	}
	
	public void transfer(double amount, BankAccount OtherAccount)
	{
		balance=balance-amount;
		OtherAccount.deposit(amount);
	}
	
	public void addInterest()
	{
		balance=balance+(balance*.035);
	}
	
	public void tostring()
	{

		System.out.print("The Account Number "+accountNum+", is owned by "+name+", with a Balance: $"+balance);
		if(balance>=0)
		{
			System.out.print(" It is not overdrawn.");
		}
		else
		{
			System.out.print(" It is overdrawn.");
		}
		
	}
	
}
