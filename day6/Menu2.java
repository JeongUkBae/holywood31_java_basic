package day6;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("[메뉴] \n 0. 종료 \n 1.계산기 \n 2.BMI \n 3. 윤년계산 \n 4.주민번호 \n 5.등수구하기");
		String menu = scan.next();
		
		
		switch 	(menu) {
				case "0": System.out.println("종료");
				return;

				case "1": System.out.println("계산기");
						int a = scan.nextInt();
						String op = scan.next();
						int b = scan.nextInt();
						int result = 0;
						
						switch(op) {
							case "+" : result = a + b; break;
							case "-" : result = a - b; break;
							case "*" : result = a * b; break;
							case "/" : result = a / b; break;
							case "%" : result = a % b; break;
						}
				
		
				break;
		}
		
		
	}

}
