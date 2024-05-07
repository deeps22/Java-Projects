package BasicMathProblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean prime = true;
		int num;
		System.out.println("Enter the number: ");
		num = s.nextInt();
		
		if(num<=1) {
			prime = false;
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					prime = false;
					break;
				}
			}
		}
		if(prime == true) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
	}

}
