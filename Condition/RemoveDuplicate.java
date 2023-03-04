package Condition;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
        String name="PayPal India";
		char[] charArray=name.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			charSet.add(charArray[i]);
		}
		Object[] charArra=charSet.toArray();
		for(int i=0;i<charArra.length;i++) {
			char n=(Character) charArra[i];
			if(n==' ');
			else {
				System.out.print(charArra[i]);
			}
		}

	}

}
