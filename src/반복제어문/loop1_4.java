package 반복제어문;

import java.util.Scanner;

public class loop1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        double avg;
        while(true)
        {
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            sum += num;
            count++;
        }

        avg = (double) sum / count;

        System.out.println("입력된 자료의 개수 : " + count);
        System.out.println("입력된 자료의 합계 : " + sum);
        System.out.println("입력된 자료의 평균 : " + String.format("%.2f", avg));
    }
}
