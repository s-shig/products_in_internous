package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太朗";
		taro.age = 20;
		taro.phoneNumber = "080-1234-5678";
		taro.address = "abcde@gmail.com";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "080-1234-5678";
		jiro.address = "abcde@gmail.com";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-1234-5678";
		hanako.address = "abcde@gmail.com";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		Person my = new Person();
		my.name = "茂内真一";
		my.age = 27;
		my.phoneNumber = "080-1234-5678";
		my.address = "abcde@gmail.com";
		
		System.out.println(my.name);
		System.out.println(my.age);
		System.out.println(my.phoneNumber);
		System.out.println(my.address);
		
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
