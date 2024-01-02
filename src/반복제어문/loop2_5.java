package 반복제어문;

import java.util.Scanner;

public class loop2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0)
            {
                count++;
            }
        }

        System.out.println("입력받은 짝수는 " + count + "개 입니다.");
    }
}
