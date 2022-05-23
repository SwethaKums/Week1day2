package week3.day4;

import java.util.Scanner;

public class ScannerClass {  

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String nextLine= scan.nextLine();
		
		String[] value=nextLine.split(" ");
		System.out.println(value.length);

	}

}
