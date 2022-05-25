package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Example {

	public static void main(String[] args) {
		List<String> val=new ArrayList <String>();
		val.add("Aspire System");
		val.add("Cts");
		val.add("Wipro");
		val.add("Hcl");
		Collections.sort(val);
		System.out.println(val);
		Collections.reverse(val);
		System.out.println(val);
		   
		

	}

}
