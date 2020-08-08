package Critical;

public class insertionSort {
	
	public static void main(String[] args) {
		int[] arr = {3,1,5,2,6,4};
		int length = arr.length;
		
		System.out.println("-----Printing number before sorting-----");
		printArray(arr, length);
		
		System.out.println();
		
		System.out.println("-----Printing number after sorting-----");
		insertionSortLogic(arr, length);
		printArray(arr, length);
		
	}

	public static void insertionSortLogic(int[] arr, int length) {
		
		for (int i = 1; i < length - 1; i++) {
			
		}

		
	}

	public static void printArray(int[] arr, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}