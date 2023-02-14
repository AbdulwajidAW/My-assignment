package week3.day1;



public class Palindrome {
	public static void main(String[] args) {
	String name="AMMA";
	char[] charArray=name.toCharArray();
	String rev="";
	for (int i=charArray.length-1; i>=0; i--) {
		rev=rev+charArray[i];	
		
		
	}
		if(name.equals(rev)) {
		System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		
	}
	
	
	
}
