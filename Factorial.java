import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions which gives you the factorial value of a given number
	static Scanner scan = new Scanner(System.in);
	static int x = scan.nextInt();
	public static int factorial(int x) {
		
		if(x<=1) {			
			return x;
		}else {
			return x*factorial(x-1);
		}
	}
	public static void main(String[] args) {
		//factorial( x );
		System.out.println(factorial(x));
	}
}
