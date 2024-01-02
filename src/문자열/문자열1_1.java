package 문자열;

import java.util.Scanner;

public class 문자열1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ascii = 'a';
        while(ascii != '0')
        {
            ascii = sc.next().charAt(0);
            System.out.println(ascii + " -> " + (int)ascii);
        }
    }
}
