
public abstract class SavingsAccount extends BankAcc{

	private boolean isSalaried;
	private static final float minBal=0;
	
	public SavingsAccount(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		super(accNo,accNm,accBal);
	}
	@Override
	public float withdraw(float amount)
	{
	   if(accBal>=amount)
	   {
		   return accBal-amount;
	   }
	   else 
		   return 0;
	}
	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + "]";
	}
	
}
