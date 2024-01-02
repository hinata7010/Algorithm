package 연산자;

import java.util.Scanner;

public class 연산자_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b)
        {
            System.out.print("1" + " ");
        }
        else
        {
            System.out.print("0"+ " ");
        }
        if(b >= c)
        {
            System.out.print("1"+ " ");
        }
        else
        {
            System.out.print("0"+ " ");
        }
        if(a <= b)
        {
            System.out.print("1"+ " ");
        }
        else
        {
            System.out.print("0"+ " ");
        }
        if(b < c)
        {
            System.out.print("1"+ " ");
        }
        else
        {
            System.out.print("0"+ " ");
        }
    }
}
