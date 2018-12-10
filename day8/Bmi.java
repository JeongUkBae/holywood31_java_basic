package day8;
import java.util.Scanner;
public class Bmi {
	public void bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("BMI 수치 몸무게, 키 입력");
		Double wi = scanner.nextDouble();
		Double hi = scanner.nextDouble();
		Double bmiresult = (wi/((hi*hi)/10000));
		String result2 = "";
		
			if(bmiresult>=40) {
				result2 = "고도비만"; 
			}else if(bmiresult>=35) {
				result2 = "경도비만";
			}else if(bmiresult>=25) {
				result2 = "과체중";
			}else if(bmiresult>=18.5) {
				result2 = "정상체중";
			}else {
				result2 = "저체중";
			}
			
			System.out.println("BMI: "+bmiresult+"\n"
					+ ""+result2);
		
		
	}
	
}
