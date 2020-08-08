package Critical;

public class arrayMin {

	public int findMinimum(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		
		System.out.println("findMinimum() method called !!!");
		System.out.print("Elements inside arr[] is :: " );
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
	
		arrayMin object = new arrayMin();
		
		//int arr[] = {5,2,3,1,4};
		
		int arr[] =new int[] {5,2,3,1,4,0};
		int miminum = object.findMinimum(arr);
		System.out.println("Smallest element inside the array is :: " + miminum);
	}

}
