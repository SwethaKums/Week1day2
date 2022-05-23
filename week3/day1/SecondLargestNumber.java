package week3.day1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] array= {2,99,45,22,3333,453,12,17,88,123};
		 Arrays.sort(array);
		 int array1=array.length-2;
		 System.out.println(array[array1]);
	}

}
