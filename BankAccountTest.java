
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount harrysChecking=new BankAccount(0.0,"Harry",12345,false);
		harrysChecking.tostring();
		System.out.println();
		
		harrysChecking.deposit(200);
		System.out.println("Current Balance: $"+harrysChecking.getBalance()+" Overdrawn Status: "+harrysChecking.getOverdrawn());
		System.out.println();
		
		harrysChecking.withdraw(500);
		System.out.println("Current Balance: $"+harrysChecking.getBalance()+" Overdrawn Status: "+harrysChecking.getOverdrawn());
		System.out.println();
		
		harrysChecking.deposit(400);
		System.out.println("Current Balance: $"+harrysChecking.getBalance()+" Overdrawn Status: "+harrysChecking.getOverdrawn());
		System.out.println();
		
		BankAccount harrysSavings=new BankAccount(500.0,"Harry",87654,false);
		harrysSavings.tostring();
		System.out.println();
		
		harrysChecking.transfer(50, harrysSavings);
		System.out.println("Checking Balance: $"+harrysChecking.getBalance()+" Savings Balance: $"+harrysSavings.getBalance());
		System.out.println();
		
		harrysSavings.addInterest();
		harrysSavings.tostring();
		
		
	}

}
