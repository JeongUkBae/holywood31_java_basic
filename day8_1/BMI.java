package day8_1;

import java.util.Scanner;

public class BMI {
	public void bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("체중, 키입력");
		Double wi = scanner.nextDouble();
		Double hi = scanner.nextDouble();
		Double bmi1 = (wi/((hi*hi)/10000));
		String result2 = "";
		
			if(bmi1>=40) {
				result2 = "고도비만";
			}else if(bmi1>=35) {
				result2 = "중등도비만";
			}else if(bmi1>=30) {
				result2 = "경도비만";
			}else if(bmi1>=25) {
				result2 = "과체중";
			}else if(bmi1>=25) {
				result2 = "정상";
			}else {
				result2 = "저체중";
			}
				
		System.out.println("BMI: "+bmi1);
		System.out.println(result2);
	}
	
}
