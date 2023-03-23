package week1.day2;

import java.util.Arrays;

public class LearnArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subjects = {"Eng","Eco","Geo","Tam","Poli"}; //Liberal
		Arrays.sort(subjects);
		int len = subjects.length;
		System.out.println("Total Subs: "+len);
		
		for (int i = len-1 ; i >=0; i--) {
			System.out.println(subjects[i]);
		}
			
		String[] teacher = new String[4]; //Instantiation
		teacher[0] = "Mari";
		teacher[1] = "Eswar";
		teacher[2] = "Sanki";
		teacher[3] = "Vicky";
		Arrays.sort(teacher);
		int num = teacher.length;
		System.out.println(num);
		
	}

}
