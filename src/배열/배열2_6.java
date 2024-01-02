package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][3];
        int[] subsum = new int[3];
        Arrays.fill(subsum, 0);
        int stusumsum = 0;

        for (int i = 0; i < score.length; i++) {
            int num = i+1;
            System.out.print(num + "번째 학생의 점수" + " ");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println("     국어 영어 수학 총점");
        for (int i = 0; i < score.length; i++) {
            int stusum = 0;
            int num = i+1;
            System.out.print(" " + num + "번");
            for (int j = 0; j < score[i].length; j++) {
                if(score[i][j] == 100)
                {
                    System.out.print(" " + score[i][j]);
                }
                else
                {
                    System.out.print("  " + score[i][j]);
                }
                stusum += score[i][j];
                subsum[j] += score[i][j];
            }

            System.out.println(" " + stusum);
            stusumsum += stusum;
        }

        System.out.print("합계");
        for (int j : subsum) {
            System.out.print(" " + j);
        }

        System.out.println(" " + stusumsum);
    }
}
