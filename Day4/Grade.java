/*  
���� ���� �л����� 3���Դϴ�.
* �л��� ��������� 0~100�������Դϴ�.
* 3���� ��������� �Է��ϸ�
* 1�� ȫ�浿
* 2�� ������
* 3�� �豸
* �̷��� �������� ���ּ���.������ �����ϴ�.
* ��, �л��̸��� ��ĳ�ʷ� �Է¹޽��ϴ�.
* ȫ�浿
* 49
* ������
* 78
* �豸
* 96
* ==============
* 1�� �豸 96��
* 2�� ������ 78��
* 3�� ȫ�浿 49��
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
        System.out.println("�л��̸�, ����� ������� �Է��ϼ���.");
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
            result1 = ("1��" + a1 + a+"��");
        } else if (a > b && a < c || a < b && a > c){
            result1 = ("2��" + a1 + a+"��");
        } else if( a < b && a < c){
            result1 = ("3��" + a1 + a+"��");
        } else {
            result1 = "�ٽ� �Է��ϼ���";
        }

        if(b > a && b > c){
            result2 = ("1��" + b1 + b+"��");
        } else if (b > a && b < c || b < a && b > c){
            result2 = ("2��" + b1 + b+"��");
        } else if( b < a && b < c){
            result2 = ("3��" + b1 + b+"��");
        } else {
            result2 = "�ٽ��Է��ϼ���.";
        }
              
        if(c > a && c > b){
            result3 = ("1��" + c1 + c+"��");
        } else if (c > a && c < b || c < a && c > b){
            result3 = ("2��" + c1 + c+"��");
        } else if( c < a && c < a){
            result3 = ("3��" + c1 + c+"��");
        } else {
            result3 = "�ٽ��Է��ϼ���.";
        }
        
        switch(result1){
            case "1��" : 

        }


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}