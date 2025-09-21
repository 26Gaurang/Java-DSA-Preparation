package stringsProblems;

public class StringPalindrome {

public static void isPalindrome(String name) {
	
	String reversed = "";
	for(int i=name.length()-1;i>=0;i--) {
		reversed += name.charAt(i);
	}
		if(name.equals(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	
	
}	
	
	public static void main(String[] args) {
		isPalindrome("mom");
		isPalindrome("dad");
		isPalindrome("sis");
		
	}

}
