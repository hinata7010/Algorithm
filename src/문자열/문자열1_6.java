package 문자열;

import java.util.Scanner;

public class 문자열1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            char n = sc.nextLine().charAt(0);
            if('a' <= n && 'z' >= n)
            {
                System.out.println("소문자입니다.");
            }
            else if ('A' <= n && 'Z' >= n)
            {
                System.out.println("대문자입니다.");
            }
            else if('0' <= n && '9' >= n)
            {
                System.out.println("숫자문자입니다.");
            }
            else
            {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
