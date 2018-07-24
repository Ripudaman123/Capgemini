//To test the distance class by passing value
public class DistanceTest {

	public static void main(String args[]) {
		Distance obj1 = new Distance();
		Distance obj2 = new Distance();
		Distance obj3 = new Distance();

		obj1.set(5, 10);
		obj2.set(6, 10);
		obj1.display();
		obj2.display();
		obj3 = Distance.add(obj1, obj2);

		System.out.println("Sum in feet: " + obj3.feet);
		System.out.println("Sum in inches: " + obj3.inches);
	}
}
