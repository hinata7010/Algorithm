package 반복제어문;

import java.util.Scanner;

public class loop3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
            if(sum > num)
            {
                break;
            }
        }
        System.out.println(sum);
    }
}
