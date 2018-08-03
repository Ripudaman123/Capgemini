package in.co.capgemini;

import java.util.function.Predicate;

public class PerformOperation {

	public static Predicate<Integer> isOdd(){
		Predicate<Integer> predicate=(number)->{
			return (number%2 !=0)? true:false;
		};
		return predicate;
	}
	
	public static Predicate<Integer> isEven(){
		Predicate<Integer> predicate=(number)->{
			return(number%2==0)?true:false;
		};
		return predicate;
	}
	
	public static Predicate<Integer> isPalindrome(){
		Predicate<Integer> predicate=(number)-> {
			return (Integer.toString(number)).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
		};
		return predicate;
	}
}
