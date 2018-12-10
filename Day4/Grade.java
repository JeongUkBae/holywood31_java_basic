/*  
저희 반은 학생수가 3명입니다.
* 학생의 평균점수는 0~100점사이입니다.
* 3명의 평균점수를 입력하면
* 1등 홍길동
* 2등 김유신
* 3등 김구
* 이렇게 나오도록 해주세요.동점은 없습니다.
* 단, 학생이름은 스캐너로 입력받습니다.
* 홍길동
* 49
* 김유신
* 78
* 김구
* 96
* ==============
* 1등 김구 96점
* 2등 김유신 78점
* 3등 홍길동 49점
* ==============
===============
a + a1 + a2
b + b1 + b2
c + c1 + c2
===============
**/
import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("학생이름, 평균을 순서대로 입력하세요.");
        String a1 = scan.next();
        int a = scan.nextInt();
        String b1 = scan.next();
        int b = scan.nextInt();
        String c1 = scan.next();
        int c = scan.nextInt();
        String result1 = "";
        String result2 = "";
        String result3 = "";
     
        if(a > b && a > c){
            result1 = ("1등" + a1 + a+"점");
        } else if (a > b && a < c || a < b && a > c){
            result1 = ("2등" + a1 + a+"점");
        } else if( a < b && a < c){
            result1 = ("3등" + a1 + a+"점");
        } else {
            result1 = "다시 입력하세요";
        }

        if(b > a && b > c){
            result2 = ("1등" + b1 + b+"점");
        } else if (b > a && b < c || b < a && b > c){
            result2 = ("2등" + b1 + b+"점");
        } else if( b < a && b < c){
            result2 = ("3등" + b1 + b+"점");
        } else {
            result2 = "다시입력하세요.";
        }
              
        if(c > a && c > b){
            result3 = ("1등" + c1 + c+"점");
        } else if (c > a && c < b || c < a && c > b){
            result3 = ("2등" + c1 + c+"점");
        } else if( c < a && c < a){
            result3 = ("3등" + c1 + c+"점");
        } else {
            result3 = "다시입력하세요.";
        }
        
        switch(result1){
            case "1등" : 

        }


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}