package Critical;

public class linsearch {
	
	public static void main(String[] args) {
		int arr[] = {5,1,9,2,10,15,20};
		boolean flag = false;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 100) {
				System.out.println(i+1);
				flag = true;
			}
		}
		if (flag == false) {
			
			System.out.println("Not found");
		}
		
	}
}
