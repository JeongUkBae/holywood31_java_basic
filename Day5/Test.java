import java.util.Scanner;
class Test{
    public static void main(String[] args){
        System.out.println("손님: 얼마예요?");
        Scanner scan = new Scanner(System.in);
        String price = scan.next();    // 상품 금액
        System.out.println();
        System.out.println(" 몇개 드릴까요? ");
        
        String num1 = scan.next();  
        System.out.println("손님: "+num1+" 개 주세요~");  //고객이 원하는 갯수
        
        int a = Integer.parseInt(price);
        int b = Integer.parseInt(num1);
        int result = 0;
        
            
        if(a >= 1000){
            result = a * 80/100;
            
        }else if(a >= 500){
            result = a * 10/100;
            
        }else{
          result = 0;
        }
    System.out.println("직원: 총 가격은 "+result*b+ "입니다~");
}
}