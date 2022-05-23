package week3.day1;

import java.util.Arrays;

public class ArrayLoop {

	public static void main(String[] args) {
		int [] array= {1,23,4,5,6,7,8,9,9,0,3,5};
		//to sort an array
		Arrays.sort(array);
       //to print the array
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
		}
	}

}

