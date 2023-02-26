package assignment;

public class FindCharacterOccurance {
	
	public static void main(String[] args) {
		//declare the string
		String a="Testleaf";
		//use tocharArray to convert string to character
		char[] b=a.toCharArray();
		//initialize temporary variable 
		int count=0;
		//iterate the characters
		for(int i=0;i<b.length;i++) {
			
			//use if condition
			if(b[i]=='e') {
				count++;
				
			}
		//print the count value	
		}System.out.println("e oocurance is" +count);
	}
 
}


