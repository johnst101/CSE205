package indassignments.Assign3;

public class SavingsAccount extends BankAccount {
	public boolean debit(int amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
	
	public void applyInterest() {
		if (balance > 0) {
			balance += (interestRate * balance);
		}
	}
	
	public String accountInfo() {
		String info = String.format("Type of Account : Savings\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\n", accountID, (balance / 100.00), (interestRate * 100));
		return info;
	}
}
