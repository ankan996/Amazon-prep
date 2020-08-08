package Critical;

public class reverseArray_Practise {
	
	public static void printArray(int[] arr) {
		
		int length = arr.length;
		System.out.print("Elements present inside the array :: ");
		
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverseArray(int arr[], int start, int end){
		
		int temp;
		while (arr[start] < arr[end]) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {8, 5, 10, 22, 44};
		printArray(arr);
		
		reverseArray(arr, 0, arr.length-1);
		printArray(arr);
		
	}

}
