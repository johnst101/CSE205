package indassignments.Assign3;

public abstract class BankAccount {
	protected String accountID;
	protected double interestRate;
	protected int balance;
	
	public BankAccount() {
		accountID = "0000-0000-0000-0000";
		interestRate = 0.0;
		balance = 0;
	}
	
	public boolean credit(int amount) {
		balance += amount;
		return true;
	}
	
	public abstract boolean debit(int amount);
	
	public int getBalance() {
		return balance;
	}
	
	public String getAccountID() {
		return accountID;
	}
	
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public abstract void applyInterest();
	
	public abstract String accountInfo();
}