package 선택제어문;

import java.util.Scanner;

public class 선택제어문_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");

        System.out.print("숫자를 선택하세요. ");
        int num = sc.nextInt();

        if(num == 1)
        {
            System.out.println("삽입을 선택하셨습니다.");
        }
        else if (num == 2)
        {
            System.out.println("수정을 선택하셨습니다.");
        }
        else
        {
            System.out.println("삭제를 선택하셨습니다.");
        }

    }
}
