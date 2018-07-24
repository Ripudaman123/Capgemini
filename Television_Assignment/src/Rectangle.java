//To calculate the area of the rectangle
public class Rectangle {

	double length;
	double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double Area() {
		double area = length * breadth;
		return area;
	}
}
