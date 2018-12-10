package day7;



import java.util.Scanner;

public class Calc {
	public void payb() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기");
		int a1 = scanner.nextInt();
		String op = scanner.next();
		int b1 = scanner.nextInt();
		int result = 0;
		
		switch(op) {
			case "+" : result = a1 + b1; break;
			case "-" : result = a1 - b1; break;
			case "*" : result = a1 * b1; break;
			case "/" : result = a1 / b1; break;
			case "%" : result = a1 % b1; break;
			default : result = 0; 
			break;	
		}
		System.out.println(a1+op+b1+"="+result);
		}
	
}
