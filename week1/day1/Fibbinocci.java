package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21 34
		int firstnum = 0;
		int secnum = 1;
		int sum = 0;
		
		for (int i = 1; i <= 11; i++) {
			System.out.println(firstnum);
			sum = firstnum+secnum;
			firstnum = secnum;
			secnum = sum;
			
		}

	}

}
