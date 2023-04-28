package indassignments.Assign3;

public class CreditcardAccount extends BankAccount {
	private int limit;
	
	public boolean debit(int amount) {
		if ((balance - amount) >= -limit) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
	
	public void setLimit(int limitAmount) {
		limit = limitAmount;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void applyInterest() {
		if (balance < 0) {
			balance += (interestRate * balance);
		}
	}
	public String accountInfo() {
		String info = String.format("Type of Account : Creditcard\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\nCredit Limit    : $%.2f", accountID, -(balance / 100.00), (interestRate * 100), (limit / 100.00));
		return info;
	}
}
