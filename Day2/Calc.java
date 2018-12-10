import java.util.Scanner;
class Calc{
	public static void main(String[] args){
		System.out.println("숫자A,B를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		System.out.println("숫자 A는 "+num1+" 이고");
		System.out.println("숫자 B는 "+num2+" 입니다.");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int add = a / b;
		System.out.print("두 수의 나누기은 "+add+" 입니다");
		
	}
}