
public class SavingsAccount extends BankAccount{
	private double rate = 0.025; 
	private int savingsNumber;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
	    super(name,amount);
	    this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public void postInterest() {
	    super.deposit(super.getBalance() * (rate / 12));
	}
	
	@Override
	public String getAccountNumber(){
	    return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount copy, double amount) {
		super(copy, amount);
		this.savingsNumber = copy.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
}
