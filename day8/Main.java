package day8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				while (true) {
					System.out.println("[메뉴]\n"
							+ "0.종료"
							+ "1.계산기\n"
							+ "2.BMI\n"
							+ "3.달력\n"
							+ "4.성별체크\n"
							+ "5.성적표");
					String select = scan.next();
					
					switch (select) {
					case "0" : System.out.println("종료...");break;
		
					case "1" : 
						Calc calc1 = new Calc();
						calc1.calc();
						break;
					case "2" :
						Bmi bmi = new Bmi();
						bmi.bmi();
						break;
					case "3" : 
						MyCalendar calendar = new MyCalendar();
						calendar.mycalendar();
						break;
					case "4" : 
						GenderChecker checker = new GenderChecker();
						checker.genderchecker();
						break;
					case "5" : 
						
						
						break;
					default : break;
					
					}//switch}
					
				}//while}

	}//method
} //class


