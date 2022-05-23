package week3.day4;

public class PrintOddArray {

	public static void main(String[] args) {
		String str="welcome";
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				System.out.println(Character.toLowerCase(array[i]));
				
			}
			else {
			
			System.out.println(Character.toUpperCase(array[i]));
		}
		
		}
		

	}}

	
