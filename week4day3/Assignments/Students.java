package week4day3.Assignments;

public class Students {

	public static void main(String[] args) {
		  Students student=new Students();
		  student.getStudentInfo(001);
		  student.getStudentInfo(001, "swetha");
		  student.getStudentInfo("swetha31@gmail.com", 9768798980L);
	}
	public void getStudentInfo( int idArgument) {
		System.out.println("id argument:"+idArgument);
		
	}
	public void getStudentInfo(int idArgument,String name) {
     System.out.println("Id :"+idArgument+" "+"Name:"+name);
}

    public void getStudentInfo(String email,long phoneNumber) {
     System.out.println("Email :"+email+" "+"PhoneNumber:"+phoneNumber);
   }


}
