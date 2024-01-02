package 연산자;

import java.util.Scanner;

public class 연산자_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("5개의 수를 입력하시오. ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print(numbers[0] + 3 + " ");
        System.out.print(numbers[0] - 3 + " ");
        System.out.print(numbers[0] * 3 + " ");
        System.out.print(numbers[0] / 3 + " ");
        System.out.print(numbers[0] % 3);
    }
}
