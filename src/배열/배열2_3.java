import java.util.Scanner;

public class 배열2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피보나치 수열 10항 : " + fib(10));
        System.out.println("피보나치 수열 20항 : " + fib(20));
        System.out.println("피보나치 수열 30항 : " + fib(30));
        System.out.println("피보나치 수열 40항 : " + fib(40));

    }

    public static int fib(int i)
    {
        if(i == 0)
        {
            return 0;
        }
        else if(i == 1)
        {
            return 1;
        }
        else
        {
            return fib(i-1) + fib(i-2);
        }
    }
}
