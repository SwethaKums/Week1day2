package week3.day3;

public class StringFunctions {

	public static void main(String[] args) {
		//to LowerCase()
		String name="swetha";
		String name1="kumar";
		String name2="swetha@3119$";
		String lowercase=name.toLowerCase();
		System.out.println(lowercase);
		
		//to UpperCase()
		String Uppercase=name.toUpperCase();
		System.out.println(Uppercase);
		
		//to concat()
		String concat=name.concat(name1);
		System.out.println(concat);
		
		String concat1=name.concat(" ").concat(name1);
		System.out.println(concat1);
		
		//replace()
		String replace=name.replace("w","e");
		System.out.println(replace);
		
		//replaceAll()
		String replaceall=name2.replaceAll("\\D","");
		System.out.println(replaceall);
		
		//substring()
		String substring=name.substring(3);
		System.out.println(substring);
		
		String substring1=name.substring(2,5);
		System.out.println(substring1);
		
		//split()
		String name3="Testleaf is located at naganalur";
		
		String[] var=name3.split("l");
		int length=var.length;
		System.out.println(length);
		System.out.println(var[3]);
		for(int i=0;i<var.length;i++) {
			System.out.println(var[i]);
		}
		
		
		
		
		
		
		

	}

}
