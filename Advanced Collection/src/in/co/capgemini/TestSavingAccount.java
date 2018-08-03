package in.co.capgemini;

import java.util.ArrayList;
import java.util.List;

public class TestSavingAccount {

	public static void main(String[] args) {

		
		List<SavingsAccount> list=new ArrayList<SavingsAccount>();

		list.add(new SavingsAccount(10000,101,"Raj",true));
		list.add(new SavingsAccount(20000,102,"Ram",true));
		list.add(new SavingsAccount(10000,103,"Rajan",true));
		list.add(new SavingsAccount(50000,104,"Raman",true));
		list.add(new SavingsAccount(10000,105,"Raghav",true));
		
		for(SavingsAccount list1: list)
		{
		    System.out.println(list1);
		}
	}

}
