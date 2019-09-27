package pack.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pack.model.MoneyInter;

public class MyInterProcess implements MyInter {
	private MoneyInter inter;
	private int re[];
	
	public MyInterProcess(MoneyInter inter) {
		this.inter = inter; // 지역변수 inter를 member변수 inter로 변환
	}
	
	public void inputMoney() {
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			
			int myMoney = 0;

			System.out.println("금액을 입력하세요. : ");
			
			String data = breader.readLine();
			myMoney = Integer.parseInt(data);
			re = inter.calcMoney(myMoney);
		} catch (Exception e) {
			System.out.println("inputMoney err : " + e);
		}
	}
	
	public void showData() {
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re[0] + "\n");
		sb.append("천원 : " + re[1] + "\n");
		sb.append("백원 : " + re[2] + "\n");
		sb.append("십원 : " + re[3] + "\n");
		sb.append("일원 : " + re[4] + "\n");
		
		System.out.println("결과는 다음과 같습니다. \n" + sb.toString());
		System.out.println("결과는 다음과 같습니다. \n" + sb);
	}
}