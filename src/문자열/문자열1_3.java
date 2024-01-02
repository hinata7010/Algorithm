package 문자열;

import java.util.Scanner;

public class 문자열1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "jungol olympiad";

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            System.out.print(string.charAt(num));
        }
    }
}
