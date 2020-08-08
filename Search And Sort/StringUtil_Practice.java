package Critical;

public class StringUtil_Practice {
	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		while (start < end) {
			if(charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		StringUtil_Practice object = new StringUtil_Practice();
		if(object.isPalindrome("that")) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
