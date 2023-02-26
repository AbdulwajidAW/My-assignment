package assignment;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		 //Declare a Array 
		   int[] a= {11,22,33,44,55,66,22,77,11};
		 //sort the array
		   Arrays.sort(a);
		 //iterate the values
		   for (int i = 0; i < a.length; i++) {
			   for (int j =i+1; j < a.length; j++) {
				//Use if condition
				   if(a[i]==a[j]) {
					   System.out.println("Duplicate values are:"+a[i]);
				   }
			}
			
		   }
	}
}
	
		  

