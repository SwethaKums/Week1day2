package week4.day2;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class LearnSet {

	public static void main(String[] args) {
	//Set<String> name1=new HashSet<String>();	
	Set<String> name=new TreeSet<String>();
	name.add("swetha");
	name.add("arjun");
	name.add("kumar");
	name.add("log");
	name.remove("log");
	
	System.out.println(name);
	//System.out.println(name1);
	
	
	//name.add("raja");
	boolean add=name.add("raja");
	name.add("mani");
	System.out.println(name);
	System.out.println(add);
	//name.add("mani");
	boolean add1=name.add("raja");
	System.out.println(add1);
	
	}

}
