package day7;

import java.util.Scanner;

public class Ssn {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력하세요");
		String name = scanner.next();
		String num = scanner.next();
		String result4 = "";

		char num1 = num.charAt(7);

			switch (num1) {
			case '1' : result4 = "남자"; break;
			case '3' : result4 = "남자"; break;
			case '2' : result4 = "여자"; break;
			case '4' : result4 = "여자"; break;
			case '5' : result4 = "외국인"; break;
			case '6' : result4 = "외국인"; break;
			default: result4 = "다시입력하세요~";			break;
			}
		System.out.println(name+" : "+num+" : "+result4);
	}
}
