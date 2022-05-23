package week3.day1;

public class PrintDuplicate {

	public static void main(String[] args) {
		// to print the duplicate number
		int[] array= {2,3,5,4,7,2,3,6,99,1};
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++) {
			   if(array[i]==array[j]){
				 System.out.println(array[i]);
			 }
		 }
	}
	}
	}

