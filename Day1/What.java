import java.util.Scanner;
class What{
	public static void main(String[] args){
		System.out.print("�̸�,����,�ּҴ�?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String ags = scan.next();
		String addr = scan.next();
		System.out.println();
		System.out.print("�̸��� "+name+" �̰�");
		System.out.print("���̴� "+ags+ " �̰�");
		System.out.print("�ּҴ� "+addr+ " �Դϴ�");
		
	}
}