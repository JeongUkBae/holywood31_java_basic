package day9;

import java.util.Scanner;

public class Oddsum {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 입력받은 숫자까지중 홀수의 합");
		int select = scanner.nextInt();
		String result = "";
		int odd = 0;
		
		for(int i=1; i<select; i++) {
			if(i%2!=0 && i<=select-1) {
				result += i+"+";
				odd += i;
			} 
		}		
		
		System.out.println(result+"="+odd);
		System.out.println("홀수의 합은 : "+odd);
	
		
	}//area
	public static void main(String[] args) {
		Oddsum aa = new Oddsum();
		aa.test();
}//test area
}//필드
