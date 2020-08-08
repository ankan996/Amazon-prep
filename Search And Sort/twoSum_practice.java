package Critical;

import java.util.HashMap;
import java.util.Map;

public class twoSum_practice {
	
	
	public static int[] findIndices(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer,Integer> mapObj = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (!mapObj.containsKey(target-numbers[i])) {
				mapObj.put(numbers[i], i);
			} else {
				result[1] = i;
				result[0] = mapObj.get(target - numbers[i]);
				return result;
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 11, 5, 10, 7, 8};
		int[] result = findIndices(numbers, 9);
		System.out.println("The two indices are - " + result[0] + " and " + result[1]);
	}

}
