package week4day1;

public class MyMobile {

	public static void main(String[] args) {
		Samsung sam=new Samsung();
		
		sam.makeCall();
		sam.samsungGalaxy();
		sam.samsungNote();
		sam.faceAuthendication();
		sam.sendSms();
		
		AndroidDesign design=new Samsung();
		design.sendSms();
		design.startPhone();
		
		SamsungDesign obj=new Samsung();
		obj.faceAuthendication();
		obj.samsungGalaxy();
	}

}
