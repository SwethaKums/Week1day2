package week4day3.Assignments;


import java.util.Set;
import java.util.TreeSet;


public class MissingNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Integer> name=new TreeSet<Integer>();
		name.add(4);
		name.add(6);
		name.add(7);
		name.add(2);
		name.add(3);
		name.add(1);
		name.add(9);
		name.add(10);
		name.add(8);
		name.add(8);
		name.add(6);
	System.out.println(name);
		for(int i=0;i<=name.size()-1;i++) {
			
			if(name[i]<=name[i+1]) {
				System.out.println();	
			}
			
		

	}}}


