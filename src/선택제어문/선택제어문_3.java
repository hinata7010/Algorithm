package 선택제어문;

import java.util.Scanner;

public class 선택제어문_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score >= 80)
        {
            System.out.println("축하합니다. 합격입니다.");
        }
        else
        {
            System.out.println("저런 ~~");
        }
    }
}
