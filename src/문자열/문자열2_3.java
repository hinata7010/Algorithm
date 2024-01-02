package 문자열;

import java.util.Scanner;

public class 문자열2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = {"champion", "class"};
        System.out.print("문자를 입력하세요. ");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].charAt(0) == c)
            {
                System.out.println(strings[i]);
            }
        }
    }
}
