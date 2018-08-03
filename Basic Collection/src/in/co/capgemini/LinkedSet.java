package in.co.capgemini;

import java.util.LinkedHashSet;
import java.util.Set;
//Implementing Linked HashSet
public class  LinkedSet{
//Test Class
	public static void main(String[] args) {
		
		LinkedHashSet<String> names=new LinkedHashSet<String>();
		names.add("Raj");
		names.add("Ram");
		names.add("Raman");
		names.add("Rajan");
		for(String name: names)
		{
			System.out.println(name);
		}

	}

}
class Student
{
	String names;
	public Student(String names)
	{
		this.names=names;
	}
	@Override
	public String toString() {
		return "Student [names=" + names + "]";
	}
	
}