package BasicMathProblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, r, rev = 0;
		System.out.println("Enter the number: ");
		num = s.nextInt();
		int temp = num;
		while(temp != 0) {
			r = temp % 10;
			rev = rev * 10 + r;
			temp = temp / 10;
		}
		
		if(rev == num) {
			System.out.println("Palindrome Number");	
		}
		else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
