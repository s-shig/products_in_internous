package jp.co.internous.action;

public class Iphone {

	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone();
		Android android = new Android();
		
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();
		
		android.android();
	}
}
