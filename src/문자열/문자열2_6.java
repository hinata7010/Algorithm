package 문자열;

import java.util.Scanner;

public class 문자열2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        strings[1] += strings[0].substring(0,3);
        strings[0] = strings[0].replace(strings[0].substring(0, 3),strings[1].substring(0, 3));
        for (String s : strings)
        {
            System.out.println(s);
        }
    }
}
