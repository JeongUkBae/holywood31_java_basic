package day6;

import java.util.Scanner;

class Menu{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		
			System.out.println("[메뉴] 0. 종료 \n"
					+ "1.계산기 \n"
					+ "2.BMI \n"
					+ "3.윤년계산 \n"
					+ "4.주민번호 \n"
					+ "5.등수구하기\n");
			String select = scanner.next();
			
		
			switch (select) {
			case "0" : System.out.println("정지");
				return;
			case "1" : System.out.println("숫자와 연산자를 입력하세요.");
						int a = scanner.nextInt();
						String op = scanner.next();
						int b = scanner.nextInt();
						int result = 0;
			
							switch(op) {
							case "+" : result = a + b; break;
							case "-" : result = a - b; break;
							case "*" : result = a * b; break;
							case "/" : result = a / b; break;
							case "%" : result = a % b; break;
							default : result = 0;
							}
						System.out.println(a+op+b+"="+result);
						break;
			case "2" : 
					System.out.println("체중을 입력하세요");
					Double wi = scanner.nextDouble();
					System.out.println("키를 입력하세요.");
					Double hi = scanner.nextDouble();
					Double total = (wi/(hi*hi/10000));   //bmi 수치
					String bmi = "";				// 비만 지수
				
						if(total<=40) {
							bmi = "고도비만";
						} else if(total<=35) {
							bmi = "중등도비만";
						} else if(total<=30) {
							bmi = "경도비만";
						} else if(total<=25) {
							bmi = "과체중";
						} else if(total>=18.5) {
							bmi = "정상";
						} else {
							bmi = "저체중";
						}
						System.out.println("BMI : "+total);
						System.out.println(bmi);
						break;
			case "3" :
						System.out.println("윤년계산-년도를 입력하세요.");
						int year = scanner.nextInt();
						String result3 = "";     				// 윤년값
				
							if(year%4==0 && year%400==0) {
								result3 = "윤년";
							} else {
								result3 = "평년";
							}
						System.out.println(result3);
						break;
			case "4" : 
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
							break;
			case "5" : 
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
				
						break;
			
			
			}								
	 } 

			
		

	} 

}
	