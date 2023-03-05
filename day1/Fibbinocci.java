package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 11;
		int firstnum = 0;
		int secnum = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(firstnum);
			sum = firstnum+secnum;
			firstnum = secnum;
			secnum = sum;
			
		}

	}

}
