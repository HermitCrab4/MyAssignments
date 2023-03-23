package week1.day2;

import java.util.Arrays;

public class LearnArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {28,12,89,45,78,39,20,385,485,963,112,604};
		Arrays.sort(numbers);
		System.out.println("The Min Value is: "+numbers[0]);
		System.out.println("The Max value is: "+numbers[numbers.length-1]);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
