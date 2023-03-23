package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 200;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n%i==0)
			{
			 prime = false;
			 System.out.println("Non Prime Number");
			break;
			}
			
		} if (prime)
		System.out.println("Prime Number");	
	}

}
