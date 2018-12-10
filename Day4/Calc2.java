import java.util.Scanner;
    class Calc2{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("°è»ê±â2");
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            int result = 0;

            switch(op){
                case "+" : result = a + b; break;
                case "-" : result = a - b; break;
                case "*" : result = a * b; break;
                case "/" : result = a / b; break;
                case "%" : result = a % b; break;
                default : result = 0; break;

            }
            System.out.println(a+op+b+"="+result);
        }
    }