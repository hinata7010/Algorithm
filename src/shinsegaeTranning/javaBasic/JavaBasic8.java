package shinsegaeTranning.javaBasic;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valance = 0;
        while(true)
        {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 || 2. 출금 || 3. 잔고 || 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int casenum = Integer.parseInt(sc.nextLine());
            switch (casenum)
            {
                case 1:
                    System.out.print("예금액>");
                    valance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    int outcome = Integer.parseInt(sc.nextLine());
                    if(valance - outcome < 0)
                    {
                        System.out.println("잔액이 부족합니다.");
                    }
                    else
                    {
                        valance -= outcome;
                    }
                    break;
                case 3:
                    System.out.println("잔고>" + valance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    System.exit(1);
                    break;
            }
        }
    }
}
