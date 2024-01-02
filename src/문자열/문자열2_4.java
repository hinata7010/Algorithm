package 문자열;

import java.util.Scanner;

public class 문자열2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");

        if(strings[0].length() >= strings[1].length())
        {
            System.out.println(strings[0]);
            System.out.println(strings[1]);
        }
        else
        {
            System.out.println(strings[1]);
            System.out.println(strings[0]);
        }
    }
}
