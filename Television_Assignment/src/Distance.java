//To add 2 distances in feet and inches
public class Distance {
	int feet;
	float inches;

	void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	void display() {
		System.out.println("Distance in Feet: " + feet + "\nDistance in Inches: " + inches);
	}

	static Distance add(Distance obj1, Distance obj2) {
		Distance ob = new Distance();
		ob.feet = obj1.feet + obj2.feet;
		ob.inches = obj1.inches + obj2.inches;

		if (ob.inches >= 12) {
			ob.inches -= 12;
			ob.feet++;
		}

		return ob;
	}

}
