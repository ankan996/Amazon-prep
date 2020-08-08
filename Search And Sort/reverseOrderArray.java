package Critical;

public class reverseOrderArray {
	
	public static void reverseLogic(int[] arr, int start, int end) {
		int temp;
		
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
	 int arr[] = {1,2,3,4,5};
	 reverseLogic(arr, 0, arr.length-1);
	 printArray(arr);

	 
	}

}
