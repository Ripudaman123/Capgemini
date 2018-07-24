import java.util.Scanner;

public class Palindrome2 {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	String arr[]=new String[10];
	int i,j,k,l,count; StringBuilder s=new StringBuilder("");char temp;
	System.out.println("Enter the strings");
	for(i=0;i<=9;i++)
	{
	arr[i]=sc.nextLine();
	}
	String a="";
	for(i=0;i<=9;i++)
	{   s=new StringBuilder("");
	    for(j=arr[i].length()-1;j>=0;j--)
		{
		 s=s.append(arr[i].charAt(j));
		}
	    a=s.toString();
		if(arr[i].equals(a))
		{
		 count=s.length()-1;
		 
		 for(k=0;k<=count;k++)
		 {
		 for(l=k+1;l<count;l++)
		 {
		 if((int)s.charAt(k)<(int)s.charAt(l))
		 {
		 temp=s.charAt(k);
		 s.setCharAt(k,s.charAt(l));
		 s.setCharAt(l,temp);
		 }
		 }
		 }
		 System.out.println(s+" "+(count+1));
		}
	}

	}
}
