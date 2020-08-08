package Critical;

public class reverseArray {
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverseArrayLogic(int[] arr, int start, int end) {
	
		int temp = 0;
		while(arr[start] < arr[end]) {
			
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		printArray(arr);
		
		reverseArrayLogic(arr, 0, arr.length-1);
		printArray(arr);
		
	}

}
