package week4.day3;

public class MethodOverLoadingStudent {

	public static void main(String[] args) {
	MethodOverLoadingStudent student=new MethodOverLoadingStudent();
	student.getStudentDetail("swetha");
	student.getStudentDetail(131, "swetha");
	student.getStudentDetail("swetha", 131);
	student.getStudentDetail("swetha", 9092990113L);
	student.getStudentDetail("swetha", 131, "xxxyyyzzz");
	

	}
	public void getStudentDetail(String name) {
		System.out.println("Student name:"+name);
	}
	
	public void getStudentDetail(String name,int studentId) {
		System.out.println("Student name:"+name+" "+"student id:"+studentId);
	}
	
	public void getStudentDetail(int studentId,String name) {
		System.out.println("student id:"+studentId+" "+"Student name:"+name);
	}
    
	public void getStudentDetail(String name,long mobileNumber) {
		System.out.println("Student name:"+name+" "+"mobileNumber"+mobileNumber);
	}
	
	public void getStudentDetail(String name,int studentId,String address) {
		System.out.println("Student name:"+name+" "+"studentid:"+studentId+" "+"address:"+address);
	}
	
}
