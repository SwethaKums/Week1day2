package week3.day4;

import com.sun.java_cup.internal.runtime.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		String text="Amazon has more than 17.865 employees in chennai";
		//to print only the numbers
		System.out.println(text.replaceAll("\\D",""));
		
		//to print the number of words
        String word="i like biryani";
		String[] value=word.split(" ");
		System.out.println(value.length);
		
               //(or)
		String value1[]=word.split("\\s+");
       System.out.println(value1.length);
       
       //to print the index value of 2
       System.out.println(word.charAt(2));
	
	   // to print the vowels
	   for(int i=0;i<word.length();i++) {
	   if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
	
	    System.out.print(word.charAt(i));
    	}
	
     }
    }