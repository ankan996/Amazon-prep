package Critical;

public class bubbleSortLogic {
	
	public static void main(String[] args) {
		int[] arr = {3,1,5,2,6,4};
		int length = arr.length;
		
		System.out.println("-----Printing number before sorting-----");
		printArray(arr, length);
		
		System.out.println();
		
		System.out.println("-----Printing number after sorting-----");
		bubbleSortLogic_1(arr, length);
		printArray(arr, length);
		
	}

	public static void bubbleSortLogic_1(int[] arr, int length) {
		boolean isSwapped;
		int temp;
		for (int i = 0; i < length-1; i++) {
			isSwapped = false;
			
			for (int j = 0; j < length-1-i; j++) {
				
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if (isSwapped == false) {break;}
		}
		
	}

	public static void printArray(int[] arr, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}