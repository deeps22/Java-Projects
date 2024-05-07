package BasicMathProblems;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("Enter the number: ");
		num = s.nextInt();
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		if(sum == num) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}

	}

}
