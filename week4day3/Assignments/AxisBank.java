package week4day3.Assignments;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
	 AxisBank bank=new AxisBank();
	 bank.deposit();
	 bank.fixed();
	 bank.saving();

	}
	public void deposit(){
		System.out.println("Override deposit");
	}

}
