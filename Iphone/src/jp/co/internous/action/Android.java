package jp.co.internous.action;

public class Android {

	public void android() {
		
		SmartPhone andro = new SmartPhone();

		System.out.println("androidを実行します");
		andro.play();
		andro.stop();
		andro.next();
		andro.back();
		andro.call();
		andro.mail();
		andro.photo();
		andro.internet(); 
	}
}
