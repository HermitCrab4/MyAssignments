package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		int sum = calc.add(2, 4, 6);
		System.out.println("The Sum is: "+ sum);
		
		int multipli = calc.mul(4, 2);
		System.out.println("The Multiplication is: "+ multipli);
		
		calc.sub();
	}

}
