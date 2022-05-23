package week3day5;

public class FindRepeatedLetter {

	public static void main(String[] args) {
		String str="testleaf";
		char [] array=str.toCharArray();
		int count=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]=='e') {
				count=count+1;
			}}
			System.out.println(count);
			
		
           //or
 count=0;
 for(int i=0;i<array.length-1;i++) {
	if(str.charAt(i)=='e') {
		count=count+1;
	}}
	System.out.println(count);
	
	}}
