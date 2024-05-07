package BasicMathProblems;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
