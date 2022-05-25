package week4.day3;

public class AxisBank extends MethodOverRidingRBI  {

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
        bank.saving();
        bank.deposit();
	}
         public void saving() {
		System.out.println("override saving");
	}

}
