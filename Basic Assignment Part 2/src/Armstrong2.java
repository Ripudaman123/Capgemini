
//To print Armstrong no. from 100 to 999
import java.util.*;

class Armstrong2 {
	public static void main(String args[]) {
		int a, r, sum;
		for (int i = 100; i < 1000; i++) {
			a = i;
			r = 0;
			sum = 0;
			while (a > 0) {
				r = a % 10;
				a = a / 10;
				sum = sum + (r * r * r);
			}
			if (sum == i) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
}