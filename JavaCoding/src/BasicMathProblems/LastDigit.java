package BasicMathProblems;

import java.util.Scanner;

// find last digit of numbers
public class LastDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, last;
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		last = number % 10;
		System.out.println("Last Digit is: " + last);
	}

}
