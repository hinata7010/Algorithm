package 문자열;

import java.util.Scanner;

public class 문자열2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");

        for (int i = strings.length-1; i >= 0; i--) {
            System.out.print(strings[i]);
        }
    }
}
