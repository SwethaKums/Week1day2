package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListExample {

//	private static Integer integer;

	public static void main(String[] args) {
		List<Integer> value=new ArrayList<Integer>();
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(4);
		value.add(5);
		value.add(6);
		value.add(7);
		value.add(8);
		value.add(9);
		value.add(10);
		
		
		
		for(int i=0;i<value.size();i++) {
			Integer integer = value.get(i);
			System.out.println(integer);
			
		}
	//	for(int i=value.size()-1;i>=0;i--) {
	//	Integer	integer1 = value.get(i);
	//		System.out.println(integer1);
			
		//}
		
		Collections.sort(value);
		System.out.println(value);
		
		Collections.reverse(value);
		System.out.println(value);
		
		//for each
		for(Integer integer2:value) {
			System.out.println(integer2);
		}
		
		

	}

}
