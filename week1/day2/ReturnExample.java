package week1.day2;

public class ReturnExample {
	
	public static void main(String[] args) {
	  ReturnExample var=new ReturnExample();
	  int test=var.add(30,20);
	  var.sub(test,10);
	}
	public  int add(int a,int b ) {
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	public void sub(int c,int b) {
		int d=70-b;
		System.out.println(d);
	
	}
	
}

