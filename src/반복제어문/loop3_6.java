package 반복제어문;

import java.util.Scanner;

public class loop3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        drawnumber(5);
    }

    public static void drawnumber(int n)
    {
        int count=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
