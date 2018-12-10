package day8;

import java.util.Scanner;

public class GenderChecker {
	public void genderchecker() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 주민번호 입력");
		String name = scanner.next();
		String gender = scanner.next();
		
		char g = gender.charAt(7);
		String result4 = "";
		
			switch (g) {
				case '1': result4 = "남자";	break;
				case '2': result4 = "여자";	break;
				case '3': result4 = "남자";	break;
				case '4': result4 = "여자";	break;
				case '5': result4 = "외국인";	break;
				case '6': result4 = "외국인";	break;
				default: result4 = "다시입력하세요.";
				break;
			}
		System.out.println(result4);
	
	
	}
	
}
