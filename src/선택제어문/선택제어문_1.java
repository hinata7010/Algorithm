package 선택제어문;

import java.util.Scanner;

public class 선택제어문_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
        if(num > 10)
        {
            System.out.println("10보다 큰수를 입력하셨습니다.");
        }
    }
}
