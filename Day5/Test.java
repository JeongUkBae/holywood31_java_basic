import java.util.Scanner;
class Test{
    public static void main(String[] args){
        System.out.println("�մ�: �󸶿���?");
        Scanner scan = new Scanner(System.in);
        String price = scan.next();    // ��ǰ �ݾ�
        System.out.println();
        System.out.println(" � �帱���? ");
        
        String num1 = scan.next();  
        System.out.println("�մ�: "+num1+" �� �ּ���~");  //���� ���ϴ� ����
        
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
    System.out.println("����: �� ������ "+result*b+ "�Դϴ�~");
}
}