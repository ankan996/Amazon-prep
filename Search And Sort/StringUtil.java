package Critical;

public class StringUtil {
	
	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		System.out.println(charArray);
		
		int start = 0;
		int end = charArray.length-1;
		
		while (start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		StringUtil object = new StringUtil();
		
		if (object.isPalindrome("malayalam")) {
			System.out.println("Palindrome");
		} else { System.out.println("Not Palindrome"); }
	}
}
