
public abstract class BankAcc {

	private static int accNo;
	private String accNm;
    static float accBal;
	
	public BankAcc(int accNo,String accNm,float accBal)
	{
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}

    public float withdraw(float amount)
    {
    	accBal=accBal-amount;
    	return accBal;
    }
    public void deposit(float amount)
    {
    	accBal=accBal+amount;
    }

	@Override
	public String toString() {
		return "BankAcc [accNm=" + accNm + "]";
	}
    
}
