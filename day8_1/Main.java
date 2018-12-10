package day8_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			while(true) {
				System.out.println("[메뉴] \n 0.종료 "
						+ "\n1.계산기"
						+ "\n2.BMI"
						+ "\n3.달력"
						+ "\n4.성별체크");
				String select = scanner.next();
				
				switch (select) {
					case "0" : 
							System.out.println("종료...");	
							return;
					case "1" : 
							Calc calc = new Calc();
							calc.calc();
							break;
					case "2" :  
							BMI bmi = new BMI();
							bmi.bmi();
							break;
					case "3" : 
						break;
					case "4" : 
						break;
					default :  break;
				}//스위치1
			}//와일1
				
		
	}//에어리어

}//필드
