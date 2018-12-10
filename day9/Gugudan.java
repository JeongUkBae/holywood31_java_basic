package day9;

import java.util.Scanner;

public class Gugudan {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 구구단을 외자 ");
		int gugu = scanner.nextInt();
		String result = "";
		
		for(int i=1; i<10; i++) {
			result += ""+gugu+"X"+i+"="+gugu*i+"\n";
		}//for1
		System.out.println(result);
}//에어리어 

	public static void main(String[] args) {
		Gugudan aa = new Gugudan();
		aa.test();
 }//test 메인에어리어
}//필드 	

