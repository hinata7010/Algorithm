package 문자열;

import java.util.Scanner;

public class 문자열2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ints = sc.nextLine().split(" ");
        String[] doubles = sc.nextLine().split(" ");

        int intsum = Integer.parseInt(ints[0]) + Integer.parseInt(ints[1]);
        double doublesum = Double.parseDouble(doubles[0]) + Double.parseDouble(doubles[1]);

        System.out.println(ints[0] + " + " + ints[1] + " = " + intsum);
        System.out.println(doubles[0] + " + " + doubles[1] + " = " + String.format("%.2f", doublesum));
    }
}
