package 반복제어문;

import java.util.Scanner;

public class loop1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int num = 0;
        while(true)
        {
            num = sc.nextInt();
            if(num > 100 || num < 0)
            {
                System.exit(1);
            }
            if(num >= 80)
            {
                System.out.println("축하합니다. 합격입니다.");
            }

            else
            {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
    }
}
