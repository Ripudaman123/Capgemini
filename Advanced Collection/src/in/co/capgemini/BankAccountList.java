package in.co.capgemini;

import java.util.TreeSet;
import java.util.Set;


public class BankAccountList {

	public static void main(String[] args) {
		
		Set<SavingsAccount> list2=new TreeSet<>(); 

		list2.add(new SavingsAccount(10000,101,"Raj",true));
		list2.add(new SavingsAccount(20000,102,"Ram",true));
		list2.add(new SavingsAccount(10000,101,"Raj",true));
		list2.add(new SavingsAccount(50000,104,"Raman",true));
		list2.add(new SavingsAccount(10000,105,"Raghav",true));
	
		for(SavingsAccount list1: list2)
		{
		    System.out.println(list1);
		}
	
	}

}
