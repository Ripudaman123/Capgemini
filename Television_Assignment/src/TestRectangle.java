//To test the Rectangle class and print the area of rectangle
public class TestRectangle {

	public static void main(String args[]) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		double area1, area2;

		rectangle1.setLength(10);
		rectangle1.setBreadth(15);
		rectangle2.setLength(15);
		rectangle2.setBreadth(10);

		area1 = rectangle1.Area();
		area2 = rectangle2.Area();

		if (area1 == area2) {
			System.out.println("Area is same");
		} else {
			System.out.println("Area is different");
		}
	}
}
