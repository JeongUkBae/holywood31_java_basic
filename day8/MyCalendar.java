package day8;

import java.util.Scanner;

public class MyCalendar {
	public void mycalendar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("윤년");
		int year = scanner.nextInt();
		String result3 = "";
		
			if(year%4==0 && year%400==0) {
				result3 = "윤년";
			} else {
				result3 = "평년";
			}
		System.out.println(result3);
		
	}
	
	
}
