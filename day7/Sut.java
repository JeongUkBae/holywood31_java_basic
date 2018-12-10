package day7;

import java.util.Scanner;

public class Sut {
	public void sut() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요");
		System.out.println("평균점수를 입력하세요");
		String sut1 = scanner.next(); //홍길동
		int n1 = scanner.nextInt(); // 점수
		String sut2 = scanner.next(); //김유신
		int n2 = scanner.nextInt(); // 점수
		String sut3 = scanner.next(); // 김구 
		int n3 = scanner.nextInt(); // 점수
		String one = "";
		String two = "";
		String three = "";
		
				
		if (n1 > n2 && n2 > n3) {
			one = "1등";
			two = "2등";
			three = "3등";
		} else if(n1 > n3 && n3 > n2) {
			one = "1등";
			two = "3등";
			three = "2등";
		} else if(n2 > n1 && n1 > n3) {
			one = "2등";
			two = "1등";
			three = "3등";
		} else if(n2 > n3 && n3 > n1) {
			one = "3등";
			two = "1등";
			three = "2등";
		} else if(n3 > n1 && n1 > n2) {
			one = "3등";
			two = "2등";
			three = "1등";
		} else if(n3 > n2 && n2 > n1) {
			one = "3등";
			two = "2등";
			three = "1등";
		} else {
		} 
		System.out.println(one+" "+sut1);
		System.out.println(two+" "+sut2);
		System.out.println(three+" "+sut3);
	}
	
}
