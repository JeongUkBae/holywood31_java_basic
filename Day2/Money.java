import java.util.Scanner;
class Name{
	public static void main(String[] args){
		System.out.println("���� ������?");
		Scanner scan = new Scanner(System.in);
		String factname = scan.next();	
		System.out.println("�̸���������?");
		String lastname = scan.next();
		System.out.print("����� Ǯ������" +factname + lastname+ "�̱���.");
 }
}