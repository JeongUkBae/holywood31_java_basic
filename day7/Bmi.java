package day7;
import java.util.Scanner;

public class Bmi {
	public void Bmi1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("체중을 입력하세요");
		Double wi = scanner.nextDouble();
		System.out.println("키를 입력하세요.");
		Double hi = scanner.nextDouble();
		Double total = (wi/(hi*hi/10000));   //bmi 수치
		String bmi = "";				// 비만 지수
	
			if(total>=40) {
				bmi = "고도비만";
			} else if(total>=35) {
				bmi = "중등도비만";
			} else if(total>=30) {
				bmi = "경도비만";
			} else if(total>=25) {
				bmi = "과체중";
			} else if(total>=18.5) {
				bmi = "정상";
			} else {
				bmi = "저체중";
			}
			System.out.println("BMI : "+total);
			System.out.println(bmi);
			
	}
	
}
