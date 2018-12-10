import java.util.Scanner;
        class Ssn1{
                public static void main(String[] args){
                        Scanner scan = new Scanner(System.in);
                        System.out.println("이름과 주민번호를 입력해주세요.");
                        String name = scan.next();
                        String ssn = scan.next();
                        String gender = "";
                        char ch = ssn.charAt(7);
                if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
                        System.out.print("다시 입력하세요.");
                } else if(ch=='1'||ch=='3'){
                                gender = "남자";
                        } else if(ch=='2'||ch=='4'){
                                gender = "여자";
                        } else if(ch=='5'||ch=='6'){
                                gender = "외국인";
                        } else {
                               
                        }
                       
                        System.out.println(gender);
 }
}