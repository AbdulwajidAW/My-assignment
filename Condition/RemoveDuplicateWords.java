package Condition;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords	 {
	public static void main(String[] args) {
        String word = "We learn java basics as part of java sessions in java week1";
		String[] split=word.split(" ");
		Set<String> text=new TreeSet<String>();
		for(int i=0;i<split.length;i++) {
			text.add(split[i]);
		}
		System.out.println(text);

	}

}
