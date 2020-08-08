package Critical;

public class BinarySearch {
	
	public int binarySearchLogic( int[] arr, int key) {
		int low = 0; // (0th index of the array)
		int high = arr.length-1; // (last index of the array)
		
		while(low <= high) {
			int mid = (high + low)/2; // will find the middle index of the array.
			// we will check the value at the mid[index] = key or not
			 if (arr[mid] == key) {
				 return mid;
			 }
			 if (key < arr[mid]) { // which means the key lies in the 1st half of the array
				 high = mid - 1;
				
			 } else {
				 low = mid + 1;
			 }
		}
		return -1;
	}
	
public static void main(String[] args) {
	BinarySearch obj = new BinarySearch();
	int arr[] = {1, 10, 20, 47, 59, 65, 75, 88, 99};
	System.out.println(obj.binarySearchLogic(arr, 65));
	
}
}
