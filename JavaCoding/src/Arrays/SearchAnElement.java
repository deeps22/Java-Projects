package Arrays;

public class SearchAnElement {

	public static void main(String[] args) {
		int arr[] = {1,5,3,7,4,10};
		int key = 3;
		System.out.println("index: " + search(arr, key));

	}
	
	static int search(int arr[], int key) {
	
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
