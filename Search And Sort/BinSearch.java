package Critical;

public class BinSearch {

	public int binLogic(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while (low <= high) { 
			mid = (low + high)/2;
			
			if(arr[mid] == key) {return mid;}
			if(key < arr[mid]) {high = mid - 1;} else {low = mid + 1;}
			
		
	}
		return -1;
	}	
	public static void main(String[] args) {
		
		BinSearch obj = new BinSearch();
		int arr[] = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		System.out.println(obj.binLogic(arr, 47));
	}
	
}
