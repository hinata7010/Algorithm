package 반복제어문;

import java.util.Scanner;

public class loop1_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddsum = 0, oddcount = 0;
        int oddavg;
        while(true)
        {
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            if(num % 2 == 1)
            {
                oddsum += num;
                oddcount++;
            }
        }

        oddavg =  oddsum / oddcount;

        System.out.println("홀수의 합 : " + oddsum);
        System.out.println("홀수의 평균 : " + oddavg);
    }
}
