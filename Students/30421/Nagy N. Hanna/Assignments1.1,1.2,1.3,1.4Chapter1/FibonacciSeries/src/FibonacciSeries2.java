import java.util.*;

/**
 * 
 * @author nagyhanna007 Implementing Fibonacci series with O(n) Complexity
 * + even-valued sum;
 */

public class FibonacciSeries2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, Give a positive nutural number!");
		int number = input.nextInt();
		System.out.println("The first " + number + " Fibonacci term is: ");
		display(number);
		System.out.println("\nFrom these terms the sum of the even-valued is " + getSumOfEvens(number));
        input.close();
	}

	public static int getSumOfEvens(int number) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			if (getNFibonacci(i) % 2 == 0)
				sum += getNFibonacci(i);
		}
		return sum;
	}

	public static void display(int n) {

		for (int i = 1; i <= n; i++)
			System.out.print("  " + getNFibonacci(i));
	}

	public static int getNFibonacci(int number) {

		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		if (number == 1 || number == 2)
			return 1;
		else
			for (int i = 2; i < number; i++) {
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
		return f3;

	}

}
