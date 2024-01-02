package 연산자;

import java.util.Scanner;

public class 연산자_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("두개의 수를 입력하시오.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
    }
}
