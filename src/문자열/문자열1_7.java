package 문자열;

import java.util.Scanner;

public class 문자열1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String string1 = "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char n = string.charAt(i);
            if ('a' <= n && 'z' >= n) {
                n = Character.toUpperCase(n);
                string1 += n;
            } else if ('A' <= n && 'Z' >= n) {
                n = Character.toLowerCase(n);
                string1 += n;
            }
        }

        System.out.println(string1);
    }
}
