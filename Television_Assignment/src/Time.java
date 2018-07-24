//To Calculate the sum of 2 Time
public class Time {

	int hours;
	int min;

	void setTime(int hours, int min) {
		this.hours = hours;
		this.min = min;
	}

	void showTime() {
		System.out.println("Hours: " + hours + "\nMinutes: " + min);
	}
//Sum calculation
	static Time sum(Time obj1, Time obj2) {
		Time obj = new Time();
		obj.hours = obj1.hours + obj2.hours;
		obj.min = obj1.min + obj2.min;

		if (obj.min > 60) {
			obj.min -= 60;
			obj.hours++;
		}
		return obj;
	}
}
