package BasicMathProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, r, pow=1;
		System.out.println("Enter the number: ");
		num = s.nextInt();
		
		System.out.println(isArmstrong(num));
	}
	
	static int numberOfDigits(int x) {
		int n=0;
		while(x>0) {
			n++;
			x=x/10;
		}
		return n;
	}
	
	static boolean isArmstrong(int x) {
		int n = numberOfDigits(x);
		int temp=x, sum=0;
		while(temp>0) {
			int r = temp%10;
			sum = (int) (sum + Math.pow((double) r, (double) n));
			temp = temp/10;
		}
		return(sum==x);
	}
}
