import java.util.Scanner;
class Calc{
	public static void main(String[] args){
		System.out.println("����A,B�� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		System.out.println("���� A�� "+num1+" �̰�");
		System.out.println("���� B�� "+num2+" �Դϴ�.");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int add = a / b;
		System.out.print("�� ���� �������� "+add+" �Դϴ�");
		
	}
}