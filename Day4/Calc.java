import java.util.Scanner;
    class Cals{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("계산기");
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();

            int result = 0;

            if(op.equals("+")){
                    result = a + b;
            } else if(op.equals("-")){
                    result = a = b;
            } else if(op.equals("*")){
                    result = a * b;
            } else if(op.equals("/")){
                    result = a / b;
            } else if(op.equals("%")){
                    result = a % b;
            } else {
                System.out.println("다시입력하세요.");
            }
            System.out.println(a+op+b+"="+result);

        }
    }