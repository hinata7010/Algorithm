import java.util.Scanner;

public class 배열1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            number = sc.nextInt();
            if(number > max)
            {
                max = number;
            }
        }

        System.out.print(max);
    }
}
