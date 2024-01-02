package 반복제어문;

import java.util.Scanner;

public class loop2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sum(n);
    }

    public static void sum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
