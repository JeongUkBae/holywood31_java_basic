package day7;

import java.util.Scanner;

import day7.Calc;
public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);	
			
			while (true) {
			System.out.println("[메뉴] 0. 종료 \n"
					+ "1.계산기 \n"
					+ "2.BMI \n"
					+ "3.윤년계산 \n"
					+ "4.주민번호 \n"
					+ "5.등수구하기\n");
			
			String select = scanner.next();
			
						
				switch (select) {
						case "0" : System.out.println("종료");
					return;
			
						case "1" : Calc aa = new Calc();
								aa.payb();
						break;

						case "2" : Bmi bb = new Bmi();
								bb.Bmi1();
														
						break;
						
						case "3" : Year cc = new Year();
								cc.year();
						break;
						
						case "4" : Ssn dd = new Ssn();
								dd.ssn();
						break;
						
						case "5" : Sut ee = new Sut();
								ee.sut();
						break;
							default: System.out.println("다시입력하세요");
				
						break;	
		
				}
			}
		
		
	}

}
