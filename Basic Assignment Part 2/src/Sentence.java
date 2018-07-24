import java.util.Scanner;

public class Sentence {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String str1="";
		int i;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==' ')
			{
			    
				continue;
			}
			str1=str1+str.charAt(i);
		}
		str1=str1+str.charAt(i);
		System.out.println(str1);
		
		String word[]=str1.split(" ");
		
		System.out.println("Enter the word and position");
		String find=scanner.next();
		int pos=scanner.nextInt();
		int j=0;
		if(word[pos-1].equals(find))
		{   String output[]= new String[word.length-1];
			System.out.println("Word found");
			
			for(i=0,j=0;i<word.length;i++)
			{
				if(i==(pos-1))
				{
					continue;
				}
				output[j]=word[i];j++;
			}
			for(i=0;i<output.length;i++)
				System.out.print(output[i]+" ");
		}
		else
			System.out.println("Not Found  ");
	}
}
