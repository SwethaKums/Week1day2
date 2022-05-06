package week1.day4;

public class SumOfDigits {
	public static void main(String[] args) {
		int n=65765,sum=0;
		int remainder;
		while(n>0) {
			remainder=n%10;
			sum=sum+remainder;
			n=n/10;	
			
		}
		
		System.out.println(sum);
	    
	}
}
