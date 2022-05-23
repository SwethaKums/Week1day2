package week3.day3;
import java.util.Arrays;

public class Anagram {

public static void main(String[] args) {
		
String name1="Stops";
String name2="Potss";
//to find the length of the strings
int length1=name1.length();
int length2=name2.length();
//to check the whether both the length are same
if(length1==length2) {
	System.out.println("True");
}

//to change into lowercase
String lowercase1=name1.toLowerCase();
String lowercase2=name1.toLowerCase();

//to change string into charArray
char[] array1=lowercase1.toCharArray();
char[] array2=lowercase2.toCharArray();

//to sort the Array

Arrays.sort(array1);
Arrays.sort(array2);
 
//to print the array
for(int i=0;i<array1.length;i++) {
	System.out.println(array1[i]);
}

for(int i=0;i<array2.length;i++) {
	System.out.println(array2[i]);
}

//to check whether the two arrays are equal
boolean value=Arrays.equals(array1,array2);

if(value==true) {
		System.out.println("it is an anagram");
}
	else {
		System.out.println("it is not an anagram");
	}

	}

}
