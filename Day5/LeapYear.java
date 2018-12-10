import java.util.Scanner;
    class LeapYear{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("년도를 입력하세요.");
            int year = scan.nextInt();
            String un = "";
            String un2 = "";
            String day = "";
            String moth = "";
            String day2 = "";
            int mo = 1;

            if(year%4==0 && year%100==0||year%400==0){
                un = "윤년";
            } else {
                un = "평년";
            }

            
                switch (un){  //2월 윤년 구분
                    case "윤년" : day = "29";
                        break;
                    case "평년" : day = "28";
                    default: day = "28";
                        break;
                }   
              

            while (mo <= 12){  // moth 월 나열
               
                moth += mo+"월" ;
               
                mo++;
            }

            switch(moth){    // 
                case "1월" : day2 = "31일"; break;
                case "2월" : day2 =  un ; break;
                case "3월" : day2 = "31일"; break;
                case "4월" : day2 = "30일"; break;
                case "5월" : day2 = "31일"; break;
                case "6월" : day2 = "30일"; break;
                case "7월" : day2 = "31일"; break;
                case "8월" : day2 = "31일"; break;
                case "9월" : day2 = "30일"; break;
                case "10월" : day2 = "31일"; break;
                case "11월" : day2 = "30일"; break;
                case "12월" : day2 = "31일"; break;

                default : day2 = "다시입력하세요"; break;
            }

            System.out.println(moth);


        }
    }