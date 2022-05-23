package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="swetha";
		char[]charArray=name.toCharArray();
		//to print the CharArray
		System.out.println(charArray);
		//to reverse the charArray
		for(int i=charArray.length-1;i>=0;i--) {
		System.out.println(charArray[i]);

	}

}
}