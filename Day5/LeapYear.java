import java.util.Scanner;
    class LeapYear{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("�⵵�� �Է��ϼ���.");
            int year = scan.nextInt();
            String un = "";
            String un2 = "";
            String day = "";
            String moth = "";
            String day2 = "";
            int mo = 1;

            if(year%4==0 && year%100==0||year%400==0){
                un = "����";
            } else {
                un = "���";
            }

            
                switch (un){  //2�� ���� ����
                    case "����" : day = "29";
                        break;
                    case "���" : day = "28";
                    default: day = "28";
                        break;
                }   
              

            while (mo <= 12){  // moth �� ����
               
                moth += mo+"��" ;
               
                mo++;
            }

            switch(moth){    // 
                case "1��" : day2 = "31��"; break;
                case "2��" : day2 =  un ; break;
                case "3��" : day2 = "31��"; break;
                case "4��" : day2 = "30��"; break;
                case "5��" : day2 = "31��"; break;
                case "6��" : day2 = "30��"; break;
                case "7��" : day2 = "31��"; break;
                case "8��" : day2 = "31��"; break;
                case "9��" : day2 = "30��"; break;
                case "10��" : day2 = "31��"; break;
                case "11��" : day2 = "30��"; break;
                case "12��" : day2 = "31��"; break;

                default : day2 = "�ٽ��Է��ϼ���"; break;
            }

            System.out.println(moth);


        }
    }