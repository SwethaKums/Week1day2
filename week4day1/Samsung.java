package week4day1;

public class Samsung implements AndroidDesign,SamsungDesign {

	public void startPhone() {
		System.out.println("start phone");
		
	}

	public void makeCall() {
		System.out.println("make a call");
		
	}

	public void sendSms() {
		System.out.println("send sms");
		
		
	}
	public void samsungNote() {
		System.out.println("Samsung Note");
		}
	
	public void faceAuthendication() {
		System.out.println("FaceAunthentication");
		
	}

	public void samsungGalaxy() {
		System.out.println("Samsunggalaxy");
		
	}

	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.makeCall();
		obj.sendSms();
		obj.samsungNote();
		obj.startPhone();
	}

	
}
