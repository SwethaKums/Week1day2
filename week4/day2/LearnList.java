package week4.day2;

import java.util.ArrayList;
import java.util.List;


public class LearnList {

	public static void main(String[] args) {
	List<String>val=new ArrayList<String>();
   val.add("swetha");
   val.add("kumar");
   val.add("log");
   val.add("arjun");
   val.add("swetha");
   val.add(0,"raja");
   
   System.out.println(val.size());
   System.out.println(val);
   
   boolean contains=val.contains("log");
   System.out.println(contains);
   
   boolean contain=val.contains("gfhkjhkj");
   System.out.println(contain);
   
   String value=val.remove(0);
   System.out.println(value);
   
   String string = val.get(3);
   System.out.println(string);
       
   val.remove(1);
   System.out.println(val);
   
   val.remove("arjun");
   System.out.println(val);
   
   val.removeAll(val);
   System.out.println(val);
   
   boolean empty=val.isEmpty();
   System.out.println(empty);
   
   
	}

}
