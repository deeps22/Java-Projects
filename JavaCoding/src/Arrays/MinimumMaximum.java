package Arrays;

public class MinimumMaximum {
	public static void main(String[] args) {
		
		int num[] = {45, 67, 3, 8, 20};
		int n = num.length;
		System.out.println("Minimum Element: " + minElement(num, n));
		System.out.println("Maximum Element: " + maxElement(num, n));
		
	}
	
	static int minElement(int num[], int n) {
		int mini = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(num[i] < mini) {
				mini = num[i];
			}
		}
		return mini;
	}
	
	static int maxElement(int num[], int n) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}
}
