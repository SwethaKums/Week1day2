package week4day3.Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacter {

	public static void main(String[] args) {
		String str = "babub";
		   char[] charArray = str.toCharArray();
		   Set<Character> name=new HashSet<Character>();
		   name.add('b');
		   name.add('a');
		   name.add('b');
		   name.add('u');
		   name.add('b');
		   
		   name.remove('b');
		   System.out.println(name);
	}}	   
		   
		