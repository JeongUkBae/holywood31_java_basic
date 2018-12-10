package day8;

import java.util.Scanner;
public class Calc {
	public void calc() {
		Scanner scan = new Scanner(System.in);
		System.out.println("[계산기] 숫자 x n y 를 입력하세요");
		int x = scan.nextInt();
		String op = scan.next();
		int y = scan.nextInt();
		int result1 = 0;	
		
		switch (op) {
		case "+": result1 = x + y; break;
		case "-": result1 = x - y; break;
		case "*": result1 = x * y; break;
		case "/": result1 = x / y; break;
		case "%": result1 = x % y; break;

		default: result1 = 0;
			break;
		}
		
		
		
		System.out.println(x+op+y+"="+result1);
		
	}
	
}
