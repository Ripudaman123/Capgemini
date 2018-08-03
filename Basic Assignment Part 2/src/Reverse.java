import java.util.Scanner;

//To print the reverse of each word in a string
public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();

		String[] words = s.split(" ");
		String revstring = "";
		int i, j;
		String word = "";
		String revword = "";
		for (i = 0; i < words.length; i++) {
			word = words[i];
			revword = "";
			for (j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revstring = revstring + revword + " ";
		}
		System.out.println(revstring);
	}
}
