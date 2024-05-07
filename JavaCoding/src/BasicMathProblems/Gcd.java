package BasicMathProblems;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		int hcf =0;
		System.out.println("Enter the first number : ");
		num1 = s.nextInt();
		System.out.println("Enter the second number : ");
		num2 = s.nextInt();
		for(int i=1; i<=num1 || i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				hcf = i;
			}
		}
		System.out.println("GCD of 2 numbers : " + hcf);

	}

}
