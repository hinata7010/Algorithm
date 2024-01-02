package shinsegaeTranning.javaBasic;

import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        int[] scores = new int[0];
        while(true)
        {
            System.out.print("선택> ");
            int casenum = Integer.parseInt(sc.nextLine());
            switch (casenum)
            {
                case 1:
                    System.out.print("학생수 :");
                    scores = new int[Integer.parseInt(sc.nextLine())];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]>" + scores[i]);
                    }
                    break;
                case 4:
                    int sum = 0, max = Integer.MIN_VALUE;
                    double avg;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                        if(scores[i] > max)
                        {
                            max = scores[i];
                        }
                    }
                    avg = (double) sum /scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(1);
                    break;
            }
        }
    }
}
