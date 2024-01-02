import java.util.Scanner;

public class 배열1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print(numbers[2] + " ");
        System.out.print(numbers[4] + " ");
        System.out.print(numbers[9]);
    }
}
