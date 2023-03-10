package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {35,47,98,45,67,89};
		Arrays.sort(scores);
		int len = scores.length;
		System.out.println("The Length: "+len);
		System.out.println("The Index: "+scores[3]);
		
		for (int i = 0; i < len; i++) {
			System.out.println(scores[i]);
		
		}
	}

}
