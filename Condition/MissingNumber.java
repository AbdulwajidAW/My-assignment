package Condition;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
        int[] data = {1,2,3,4,6,7,8,9};
		Set<Integer> num=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			num.add(data[i]);
		}
		Object[] a=num.toArray();
		for(int i=0;i<a.length;i++) {
			int n=(Integer) a[i];
			int j=(Integer) a[i+1];
			if(j==n+1);
			else {
				n++;
				System.out.println(n);
			}
		}

	}


}
