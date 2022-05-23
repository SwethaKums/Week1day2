package week3day5;

public class Equals {

	public static void main(String[] args) {
		
		//.equals(to check the content)
		String name="swetha";
		String name2="swetha";
		if(name.equals(name2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	
//==(to check the memory)
	String value1=new String("Swe");
	String value2="Swe";
	if(value1==value2){ 
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
}}
