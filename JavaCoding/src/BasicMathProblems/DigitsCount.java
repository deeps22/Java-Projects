package BasicMathProblems;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, count=0;
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		while(number != 0) {
			number = number / 10;
			++count;
		}
		System.out.println("Number of Digits : " + count);

	}

}
