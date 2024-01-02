package 연산자;

import java.util.Scanner;

public class 연산자_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a = " + ++a + ", b = " + (b--) + ", c = " + (a+(++b)));
    }
}
