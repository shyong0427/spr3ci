package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml"); // meta file 지정
		MyInter myInter = (MyInter)context.getBean("my"); // return type이 Object이기 때문에 casting
		
		myInter.inputMoney();
		myInter.showData();
	}
}