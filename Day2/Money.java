import java.util.Scanner;
class Name{
	public static void main(String[] args){
		System.out.println("성이 뭔가요?");
		Scanner scan = new Scanner(System.in);
		String factname = scan.next();	
		System.out.println("이름은뭔가요?");
		String lastname = scan.next();
		System.out.print("당신의 풀네임은" +factname + lastname+ "이군요.");
 }
}