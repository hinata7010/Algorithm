package 문자열;

import java.util.Scanner;

public class 문자열2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        System.out.print("문자를 입력하세요.");
        String c = sc.nextLine();
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].contains(c))
            {
                System.out.println(strings[i]);
            }
        }

        System.out.print("문자를 입력하세요.");
        c = sc.nextLine();
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].contains(c))
            {
                System.out.println(strings[i]);
            }
        }
    }
}
