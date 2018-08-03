package in.co.capgemini;

import java.util.HashSet;
import java.util.Set;

//To test that set doesn't accept duplicate objects
public class SetTest {

	public static void main(String[] args) {
		
		Set<Employee> employees=new HashSet<>();
		
		employees.add(new Employee(1,"Raj"));
		employees.add(new Employee(2,"Ram"));
		employees.add(new Employee(3,"Raman"));
		employees.add(new Employee(4,"Rajan"));
		employees.add(new Employee(1,"Raj"));
        
		for(Employee employee: employees) {
			System.out.println(employee);
		}
	}

}
class Employee
{
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	//overriding equals() and hashcode() method.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
