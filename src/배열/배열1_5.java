import java.util.Scanner;

public class 배열1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        boolean flag = true;

        while(flag)
        {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            if(month < 0 || month > 12)
            {
                System.out.println("잘못 입력하였습니다.");
            }

            else
            {
                switch (month)
                {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("입력하신 달의 날 수는 31일입니다.");
                    break;
                    case 4: case 6: case 9: case 11:
                    System.out.println("입력하신 달의 날 수는 30일입니다.");
                    break;
                    case 2:
                        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        {
                            System.out.println("입력하신 달의 날 수는 29일입니다.");
                        }
                        else
                        {
                            System.out.println("입력하신 달의 날 수는 28일입니다.");
                        }
                        break;
                    default:
                        flag = false;
                        break;
                }
            }
        }
    }
}
