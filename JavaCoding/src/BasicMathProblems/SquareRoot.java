package BasicMathProblems;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num = s.nextInt();
		System.out.println(squareRoot(num));
		//System.out.println(Math.sqrt(num));

	}

	static int squareRoot(int x) {
		int i = 1 , result = 1;
		if(x == 0 || x == 1) {
			return x;
		}
		while(result <= x) {
			i++;
			result = i * i;
		}
		return i-1;
	}
}
