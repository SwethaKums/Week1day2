package week4day1;

public class MyTv extends Sony{
	public static void main(String[] args) {
		MyTv tv=new MyTv();
		tv.hotstar();
		tv.primeVideo();
		tv.youtube();
	}



	@Override
	public void youtube() {
		System.out.println("Youtube");
		
	}

	@Override
	public void primeVideo() {
		 System.out.println("Primevideo");
		
	}}
	