package 선택제어문;

import java.util.Scanner;

public class 선택제어문_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b)
        {
            System.out.println("입력받은 수 중 큰 수는 " + a + "이고 작은 수는" + b + " 입니다.");
        }
        else
        {
            System.out.println("입력받은 수 중 큰 수는 " + b + "이고 작은 수는" + a + " 입니다.");
        }
    }
}
