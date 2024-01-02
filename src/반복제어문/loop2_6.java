package 반복제어문;

import java.util.Scanner;

public class loop2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        avg = sum / 5;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (double)Math.round(avg*10/10));
    }
}
