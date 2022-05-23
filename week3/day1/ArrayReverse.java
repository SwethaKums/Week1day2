package week3.day1;

import org.bouncycastle.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int arr[]= {3,4,5,24,57,24,4664,35};
		//to revese an array
		Arrays.reverse(arr);
		int len=arr.length;
		for(int i=len-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
