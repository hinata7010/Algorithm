package 문자열;

import java.util.Scanner;

public class 문자열1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split(" ");


        for (String s : strings)
        {
            System.out.println(s);
        }
    }
}
