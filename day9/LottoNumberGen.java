package day9;

import java.util.Random;

public class LottoNumberGen {
	public void test() {
		// Lotto 6개의 랜덤숫자
		// 1~ 45 까지 랜덤숫자
		Random random = new Random();
		int[] a = new int[6];
		String result = "";

		for(int i=0; i<6; i++) {
				int limit = random.nextInt(45);
				if(i<5) {
					result += limit+",";
				}else {
					result += limit+"";
				}
			}
		System.out.println(result);
		}
		
		public static void main(String[] args) {
			LottoNumberGen gen = new LottoNumberGen();
			gen.test();
		}
	
	}

