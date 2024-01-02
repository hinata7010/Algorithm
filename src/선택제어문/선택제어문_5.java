package 선택제어문;

import java.util.Scanner;

public class 선택제어문_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        if(r1 >=4 && r2 >= 4)
        {
            System.out.println("이겼습니다.");
        }
        else if(r1 >=4 || r2 >= 4)
        {
            System.out.println("비겼습니다.");
        }
        else
        {
            System.out.println("졌습니다.");
        }
    }
}
