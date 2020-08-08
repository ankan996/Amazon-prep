package Critical;

public class ArrayUtil {

	public void printArray(int arr[]) {

		int arrCapacity = arr.length;
		System.out.println("Length of the array :: " + arrCapacity);
		System.out.print("Elements inside the array is == ");
		for(int i = 0; i < arrCapacity;i++) {
			System.out.print(arr[i] + " ");
		}
	
		System.out.println();
	}
	
	public int[] resize(int arr[], int capacity) {
		int tempArray[] = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			tempArray[i] = arr[i];
			System.out.print(tempArray[i] + " ");
		}
		
		return tempArray;
	}
	
	public int findMinimum(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		ArrayUtil object = new ArrayUtil();
		
		int arr[] = {4, 2, 1, 5};
		object.printArray(arr);
		
		int original[] = new int[] {4, 2, 1, 5, 6};
		System.out.println("The size of the array is :: " + original.length);
		original = object.resize(original, 10);
		System.out.println("After resize, the size of the array is :: " + original.length);
		
		int minimum = object.findMinimum(arr);
		System.out.println("The smallest value inside the array is :: " + minimum);
	}
}
