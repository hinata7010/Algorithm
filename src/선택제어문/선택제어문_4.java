package 선택제어문;

import java.util.Scanner;

public class 선택제어문_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score <= 20)
        {
            System.out.println("E");
        } else if (score <= 40) {
            System.out.println("D");
        } else if (score <= 60) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
