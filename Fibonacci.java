import java.util.Scanner;

public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.
	
	public static void iterativefib(int index) {
		int a0= 0, a1=1,tempi=0;
	if(index>=0) {
		if(index>=2) {
			for(int i=2; i<=index;i++) {
				tempi =a0+a1;
				a0=a1;
				a1= tempi;
			}
			System.out.println("fibonacci of given index using iterativefib " + tempi);
		}
		else {
			System.out.println("fibonacci of given index using iterativefib " + index);
		}
	}
	else {
		System.out.println("Invalid");
	}
}

	public static int fibrek(int index) {
		if(index<2) {
			return index;
		}
		else {
			return fibrek(index-1)+fibrek(index-2);
		}
	}
	
	/*
	 * fib(4)=3 -> 01123
	 * fib(2)=1 = 0+1
	 * fib(3)=2 = fib(2)+fib(1) = fib(3-1)+fib(3-2)
	 * fib(n)=fib(n-1) + fib(n-2)
	 * fib(n)=fib((n-1)+(n-2))
	 * */
	
	public static void main(String[] args) {
         	
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		iterativefib(index);
        System.out.println(" fibanocci using recursive" +" "+fibrek(index));
	}
	
}
