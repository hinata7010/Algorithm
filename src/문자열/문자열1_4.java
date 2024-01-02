package 문자열;

import java.util.Scanner;

public class 문자열1_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        System.out.println("입력받은 문자열의 길이는 " + string.length() + "입니다.");
        for (int i = string.length()-1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
