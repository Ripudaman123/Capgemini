package in.co.capgemini;

import java.util.Set;
import java.util.TreeSet;


//Creating a list of student and implementing TreeSet
public class Treeset {

	public static void main(String[] args) {

		Set<String> names = new TreeSet<String>();
		names.add("Raj");
		names.add("Ram");
		names.add("Raman");
		names.add("Rajan");
		for (String name : names) {
			System.out.println(name);
		}

	}

}

class Student1 {
	String names;

	public Student1(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Student [names=" + names + "]";
	}

}