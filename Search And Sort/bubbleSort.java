package Critical;

public class bubbleSort {

	public static void bubbleSortLogic(int[] arr, int length) {
		boolean isSwapped;
		int temp;
		for (int i = 0; i < length-1 ; i++) {
			isSwapped = false;
			for (int j = 0; j < length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
				
			}
			if (isSwapped == false) {
				break;
			}
		}
	}
	
	public static void printArray(int arr[], int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,1,9,2,10};
		int length = arr.length;
		System.out.println("---------The numbers before sorting---------");
		printArray(arr, length);
		bubbleSortLogic(arr, length);
		System.out.println();
		System.out.println("---------The numbers after sorting---------");
		printArray(arr, length);

	}

}
