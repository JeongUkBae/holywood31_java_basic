import java.util.Scanner;
import java.util.Random;
class Rd{
    public static void main(String[] args){
        System.out.print("1부터 10까지 출력");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //int limit = scan.nextInt();
        int limit = random.nextInt(11)+1;
        System.out.println("랜덤수: "+limit);
        int count = 1;
        String res = "";
        int sum = 0;
        while(count <= limit){
           
            if(count != limit){
             res += count+"+";
             
            }else{
             res += count+"=";
             
            }
            sum += count;
            count ++;
            
        }
    
        System.out.print(res+sum);
       // 1+2+3+4+5+6+7+8+9+10= 55
       
    }    
}