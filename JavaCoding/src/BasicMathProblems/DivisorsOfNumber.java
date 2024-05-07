package BasicMathProblems;

import java.util.Scanner;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number;
		System.out.println("Enter the number :");
		number = s.nextInt();
		for(int i = 1; i <= number; i++) {
			if(number % i == 0)
				System.out.println("Divisors : " + i);
			
		}

	}

}
