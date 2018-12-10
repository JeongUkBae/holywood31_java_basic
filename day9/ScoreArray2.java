package day9;

import java.util.Scanner;

public class ScoreArray2 {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("0. 종료 / 1. 실행");
			String select = scanner.next();
			
		
				switch (select) {
				
				case "0" : System.out.println("종료...");
					return;
				
				case "1" : 
					System.out.println("학생수 몇명");
					int count = scanner.nextInt();
					System.out.println("이름, 점수 입력");	 
					String[] names = new String[count];
					 int[] scores = new int[count];
					 String namesresult = "";
					 
					 for(int i=0; i<count; i++) {
						 if(i<(count-1)) { 
							 names[i] += i+","; 
						 }else  {
							 names[i] += i+"";
					 	 }
						 System.out.println(names);
					 }
					
					 
					 break;
					 
			default:
				break;
			}
			
		}
	
		

	}
	public static void main(String[] args) {
		ScoreArray2 a = new ScoreArray2();
		a.test();
	}

	
}
