package 문자열;

import java.util.Scanner;

public class 문자열2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];

        for (int i = 0; i < 5; i++) {
            strings[i] = sc.nextLine();
        }

        for(String s : strings)
        {
            System.out.println(s);
        }
    }
}
