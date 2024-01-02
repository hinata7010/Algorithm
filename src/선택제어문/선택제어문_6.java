package 선택제어문;

import java.util.Scanner;

public class 선택제어문_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3)
        {
            System.out.println("입력받은 수 중 가장 큰 수는 " + n1 +"입니다.");
        } else if (n2 > n1 && n2 > n3)
        {
            System.out.println("입력받은 수 중 가장 큰 수는 " + n2 +"입니다.");
        }
        else
        {
            System.out.println("입력받은 수 중 가장 큰 수는 " + n3 +"입니다.");
        }
    }
}
