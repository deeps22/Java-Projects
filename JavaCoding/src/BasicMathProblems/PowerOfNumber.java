package BasicMathProblems;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, power, result = 1;
		System.out.println("Enter the number : ");
		number = scanner.nextInt();
		System.out.println("Enter the power : ");
		power = scanner.nextInt();
		for(int i = 0; i< power; i++) {
			result = result * number;
		}
		System.out.println("The result is : " + result);

	}

}
