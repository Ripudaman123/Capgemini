import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int temp=a;int r=0,sum=0;
while(a>0)
{
r=a%10;
a=a/10;
sum=sum+(r*r*r);
}
if (sum==temp)
{System.out.println("It is an Armstrong number");
}
else
{System.out.println("It is not an Armstrong number");
}
}
}