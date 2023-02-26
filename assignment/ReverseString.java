package assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		//Use Scanner() to get input in runtime
		Scanner name=new Scanner(System.in);
		String a = name.next();
		//Use toCharArray to convert string to array
		char[] charArray = a.toCharArray();
		System.out.println("Reverse name");
		//Use reverse for loop
		for (int i =charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
