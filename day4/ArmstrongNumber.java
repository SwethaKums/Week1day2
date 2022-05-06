package week1.day4;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=370, remainder;
        int calculated=0;
		int original=n;
		while(n>0) {
			remainder=n%10;
			remainder=(int)Math.pow(remainder,3);
			calculated=calculated+remainder;
			n=n/10;
			
			
		}
		if(original==calculated) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
		}
		
	}

}
