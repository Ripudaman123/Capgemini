import java.util.*;
//To print square of a number
class Square {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = sc.nextInt();
		int y = sq(x);
		
		System.out.println(x + "*" + "1=" + x + ",Square:" + y);
	}

	public static int sq(int a) {
		int p = a * a;
		return p;
	}
}