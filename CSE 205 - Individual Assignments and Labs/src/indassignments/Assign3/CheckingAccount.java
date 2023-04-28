package indassignments.Assign3;

public class CheckingAccount extends BankAccount {
	private int overdraftFee;
	
	public boolean debit(int amount) {
		balance -= amount;
		if (balance < 0) {
			balance -= overdraftFee;
		}
		return true;
	}
	
	public void setFee(int feeAmount) {
		overdraftFee = feeAmount;
	}
	
	public int getFee() {
		return overdraftFee;
	}
	
	public void applyInterest() {
		if (balance > 0) {
			balance += (interestRate * balance);
		}
	}
	
	public String accountInfo() {
		String info = String.format("Type of Account : Checking\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\nOverdraft Fee   : $%.2f", accountID, (balance / 100.00), (interestRate * 100), (overdraftFee / 100.00));
		return info;
	}
}
