package day9;

import java.util.Scanner;

public class ScoreArray {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수가 몇명?");
		int count = scanner.nextInt();
		String[] names = new String[count];
		int[] scores = new int[count];
		int iter = 0;
		
		while (true) {
			System.out.println("[종료0, 진행1]이름과 점수 입력하세요.");
			String flag = scanner.next();
			System.out.println("이터레이터: "+iter);
			System.out.println("카운터: "+count);
			if(!flag.equals("0") && iter != (count-1)) {
				names[iter] = scanner.next();
				scores[iter] = scanner.nextInt();
				iter++;
			} else {
				System.out.println("종료...");
				for(int i=0; i<names.length; i++) {
					System.out.println(names[i]+";"+scores[i]);
				}
				
			  }
			}
			
		

	}
	public static void main(String[] args) {
		ScoreArray a = new ScoreArray();
		a.test();
	}

	
}
