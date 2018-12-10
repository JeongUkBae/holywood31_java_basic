import java.util.Scanner;
class What{
	public static void main(String[] args){
		System.out.print("이름,나이,주소는?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String ags = scan.next();
		String addr = scan.next();
		System.out.println();
		System.out.print("이름은 "+name+" 이고");
		System.out.print("나이는 "+ags+ " 이고");
		System.out.print("주소는 "+addr+ " 입니다");
		
	}
}