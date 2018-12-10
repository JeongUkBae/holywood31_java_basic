/*
https://ko.wikipedia.org/wiki/%EC%B2%B4%EC%A7%88%EB%9F%89_%EC%A7%80%EC%88%98
Wikipedia
체질량 지수
체질량 지수(體質量指數, Body Mass Index, BMI)는 인간의 비만도를 나타내는 지수로, 체중과 키의 관계로 계산된다.
키가 t 미터, 체중이 w 킬로그램일 때, BMI는 다음과 같다. (키의 단위가 센티미터가 아닌 미터임에 유의해야 한다.)
**/


import java.util.Scanner;
class Bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");
		String weight = scan.next();
		System.out.println("Ű:");
		String height = scan.next();
		
		Double a = Double.parseDouble(weight);
		Double b = Double.parseDouble(height);
		Double bmi1 = (a/((b*b)/10000));
		Double result = 0.0;
		String result1 = "";
		System.out.println("BMI: "+bmi1);
		
		
		if(bmi1>=40.0){
			result1 = "����";			
		} else if(bmi1>=35.0){
			result1 = "�ߵ ��";
		} else if(bmi1>=30.0){
			result1 = "�浵��";
		} else if(bmi1>=25.0){
			result1 = "��ü��";
		} else if(bmi1>=18.5){
			result1 = "����ü��";
		} else {
			result1 = "��ü��";
		} 
		
		System.out.println(result1);
 
 }
}
