package assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
	    //declare the array
		int [] a = {2,5,6,8,9,1,3,4};
		//sort the array
		Arrays.sort(a);
	    //use the length
		int n = a.length+1; 
		//use sum formula
		int sum =( n*(n+1)/2);
		//iterate the value
		for(int i =0; i<a.length; i++) {
			sum = sum - a[i]; 
		}
		System.out.println(sum);
}

}
