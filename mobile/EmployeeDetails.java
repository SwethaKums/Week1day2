package mobile;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
	    employee.printEmployeeName("Swetha", 001);
	    employee.getEmployeeAddress("No:3 2nd street, Gandhi Nagar,Adayar,Chennai-28");
	    employee.printEmployeeSalary(10.000);
	    employee.printEmployeeMobileNumber(9099909876L);
	    
	}
	public void printEmployeeName(String empName,int empid) {
		System.out.println("The empName is " +empName);
		System.out.println("The empid is " +empid);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("The emloyeeAddress is "+empAddress);
	}
	public void printEmployeeSalary(double empSalary){
		System.out.println("The employee Salary is "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("The employee Number is "+mobNum);
	}
}
