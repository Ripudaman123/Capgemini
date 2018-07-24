import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String input1=scanner.nextLine();
		StringBuilder input=new StringBuilder(input1);
		String output="";
		int length=input.length();
		int i,j,k;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					
					input.setCharAt(j,' ');
					
				}
			}
		}
		
		for(k=0;k<length;k++)
		{
			if(input.charAt(k)==' ')
			{
				continue;
			}
			output=output+input.charAt(k);
		}
		System.out.println(output);
	}
	
}
