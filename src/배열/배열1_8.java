import java.util.Scanner;

public class 배열1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum=0;
        double avg=0;

        for (int i = 0; i < 10; i++) {
            number = sc.nextInt();

            sum+=number;
        }
        avg = (double) sum /10;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
