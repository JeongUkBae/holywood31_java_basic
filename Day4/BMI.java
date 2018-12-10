/* ���� 1)
https://ko.wikipedia.org/wiki/%EC%B2%B4%EC%A7%88%EB%9F%89_%EC%A7%80%EC%88%98
Wikipedia
ü���� ����
ü���� ����(��������, Body Mass Index, BMI)�� 
�ΰ��� �񸸵��� ��Ÿ���� ������, 
ü�߰� Ű�� ����� ���ȴ�.
Ű�� t ����, ü���� w ų�α׷��� ��, 
BMI�� ������ ����. 
(Ű�� ������ ��Ƽ���Ͱ� �ƴ� �����ӿ� �����ؾ� �Ѵ�.)

**/

import java.util.Scanner;
 class BMI{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                System.out.println("몸무게");
                String wi = scan.next();
                System.out.println("키");
                String hi = scan.next();

                Double a = Double.parseDouble(wi);
                Double b = Double.parseDouble(hi);
                Double bmi = (a/((b*b)/10000));
                System.out.println("BMI : "+bmi);
                String result = "";

               if(bmi>=40){
                        result = "과체중";
               } else if(bmi>=35){
                       result = "중등도비만";
               } else if(bmi>=30){
                        result = "경도비만";
               } else if(bmi>=25){
                        result = "과체중";
               } else if(bmi>=18.5){
                        result = "정상";
               } else if(bmi<18.5){
                        result = "저체중";
               } else {
                       result = "다시입력하세요";
               }
               
               System.out.println(result);
               
        }
}
