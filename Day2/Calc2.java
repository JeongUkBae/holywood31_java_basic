import java.util.Scanner;
class Calc2{
	public static void main(String[] args){
		System.out.println("����");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String opcode = scan.next();
		String num2 = scan.next();
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		int result = 0;
		
		if(opcode.equals("+")){
			result = a + b;
		}else{
			result = a - b;
		}

		System.out.print(a+opcode+b+"="+result);

	}
}
