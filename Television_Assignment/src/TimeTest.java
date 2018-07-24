//To test the Time class
public class TimeTest {

	public static void main(String args[]) {
		Time obj1 = new Time();
		Time obj2 = new Time();
		Time obj3 = new Time();

		obj1.setTime(5, 50);
		obj2.setTime(6, 50);
		obj1.showTime();
		obj2.showTime();
		obj3 = Time.sum(obj1, obj2);

		System.out.println("Total Time in hours: " + obj3.hours);
		System.out.println("Total Time in minutes: " + obj3.min);
	}
}
