package assignment;

public class Palindrome {
		public static void main(String[] args) {
			//declare the string
			String name="MADAM";
			//use to char array
			char[] charArray=name.toCharArray();
			//declare empty string
			String rev="";
			//use reverse for loop to iterate
			for (int i=charArray.length-1; i>=0; i--) {
				//store the reverse char in string rev
				rev=rev+charArray[i];	
				
				
			}
			//use if condition
				if(name.equals(rev)) {
				System.out.println("The given string is palindrome");
				}
				else {
					System.out.println("The given string is not palindrome");
				}
				
			}
			
			

}
