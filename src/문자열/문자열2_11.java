package 문자열;

import java.util.Scanner;

public class 문자열2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = Double.parseDouble(sc.next());
        double d2 = Double.parseDouble(sc.next());
        double d3 = Double.parseDouble(sc.next());
        String s1 = String.format("%.2f", d1);
        String s2 = String.format("%.2f", d2);
        String s3 = String.format("%.2f", d3);
        String string = s1+s2+s3;
        String[] strings = string.split("\\.");
        for(String s : strings)
        {
            System.out.println(s);
        }
    }
}
