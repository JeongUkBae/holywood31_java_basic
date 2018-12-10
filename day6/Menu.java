package day6;
import java.util.Scanner;


class Menu{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        int limit = scan.nextInt();
        int count = 1;
        String op = "";
        int sum = 0;
        boolean flag = true;
        String res = "";
        
        while(flag){
            if(count != limit){
                res += count+"+";
            } else {
                res += count+"=";
                flag = false;
            }

            
            count ++;
        }
        System.out.println(count);
    }
}