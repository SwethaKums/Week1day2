package week1.day2;

public class Arithmetic {

	public static void main(String[] args) {
	Arithmetic arith=new Arithmetic();
	float value=arith.add(3.8f, 4.9f);
	arith.sub(value, 0.67);
	}
	public float add(float d, float e) {
		float c= d+e;
		System.out.println(c);
		return c;
	}
   public void sub(double d,double b) {
	   double e=d-b;
	   System.out.println(e);
   
}}
