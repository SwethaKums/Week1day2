package week4day1;

public class Bank extends SBI{
	public static void main(String[] args) {
		 Bank bank=new Bank();
		 bank.bankBalance();
		 bank.cibilScore();
		 bank.creditScore();
		 bank.itLoan();
		 bank.maximumLoanAmount();
		 bank.minimumBalance();
		
		
		}

	@Override
	public void maximumLoanAmount() {
		System.out.println("Maximum loan amount");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("Bank balance");
		
		
	}

	

	
}
