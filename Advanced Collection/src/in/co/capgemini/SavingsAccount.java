package in.co.capgemini;

public class SavingsAccount implements Comparable<SavingsAccount>{

	private double acc_balance;
	private int acc_ID;
	public SavingsAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	private String accountHolderName;
	private boolean isSalaryAccount;


	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
	    this.acc_ID = acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(double amount) {
		acc_balance = acc_balance - amount;

		return acc_balance;
	}

	public double deposit(double amount) {
		acc_balance = acc_balance + amount;

		return acc_balance;
	}


	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}



	@Override
	public int compareTo(SavingsAccount s) {
		return this.acc_ID-s.acc_ID;
	}

	
}
