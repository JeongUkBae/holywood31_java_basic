package day7;

import java.util.Scanner;

public class Year {
	public void year() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("윤년계산-년도를 입력하세요.");
		int year = scanner.nextInt();
		String result3 = "";     				// 윤년값

			if(year%4==0 && year%400==0) {
				result3 = "윤년";
			} else {
				result3 = "평년";
			}
		System.out.println(result3);
		
	
	}
	
}
