package day9;
import java.util.Scanner;


public class NameArray2 {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		String name1 = scanner.next();
		String name2 = scanner.next();
		String name3 = scanner.next();
		String[] names = {name1,name2,name3};
		String res = "";
		
		
		for(int i=0; i<names.length; i++) {
			System.out.println("i의 값"+ i);
			if(i<(names.length -1)) {
			res += names[i]+",";
			} else {
				res+= names[i]+"";
			}
		}
		
	
		System.out.println(res);
	}

	public static void main(String[] args){
		NameArray2 aa = new NameArray2();
		ScoreArray bb = new ScoreArray();
		while (true) {
		
			
			aa.test();
				
			bb.test();
			break;
			
		}
		System.out.println(aa);
		System.out.println(bb);
	}
}
