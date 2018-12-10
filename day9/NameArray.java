package day9;
import day9.Main;
public class NameArray {
	public void test() {
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "이순신";
		names[2] = "유관순";
		String res = "";
		
		for(int i=0; i<3; i++) {
			System.out.println("i의 값"+ i);
			if(i<2) {
			res += names[i]+",";
			} else {
				res+= names[i]+"";
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		NameArray tt = new NameArray();
		tt.test();
		
	}
}		


