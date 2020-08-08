package Critical;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[] = {5,1,9,2,10,15,20};
		int length = arr.length;
		boolean flag = false;
		
		for (int i = 0; i < length; i++) {
			if (arr[i] == 10) {
				flag = true;
				System.out.println("The number is found at index :: " + i + " and the position is :: " + (i+1) + " and the value is :: " + arr[i]);
				
			} 
		}
		if (flag == false) {
			System.out.println("Not Found");
		}
	}
}
