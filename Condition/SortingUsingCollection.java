package Condition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
    String[] company= {"HCL","Aspire Systems","Wipro","CTS"};
    List<String> name=new ArrayList<String>();
    for(int i=0;i<company.length;i++) {
    name.add(company[i]);
    }
	Collections.sort(name);
	Collections.reverse(name);
	System.out.println(name);

	}


}
