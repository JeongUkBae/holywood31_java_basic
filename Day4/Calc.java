import java.util.Scanner;
    class Cals{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("����");
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
                System.out.println("�ٽ��Է��ϼ���.");
            }
            System.out.println(a+op+b+"="+result);

        }
    }