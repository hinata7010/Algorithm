package 문자열;

import java.util.Scanner;

public class 문자열2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int asciisize1=0, asciisize2=0;

        for (int i = 0; i < strings[0].length(); i++) {
            asciisize1 += strings[0].charAt(i);
        }
        for (int i = 0; i < strings[1].length(); i++) {
            asciisize2 += strings[1].charAt(i);
        }

        if(asciisize1 >= asciisize2)
        {
            System.out.println(strings[0] + " 가(이) 더 큽니다.");
        }
        else
        {
            System.out.println(strings[1] + " 가(이) 더 큽니다.");
        }
        if(strings[0].substring(0,3).equals(strings[1].substring(0,3)))
        {
            System.out.println("앞의 세 문자가 같습니다.");
        }
        else
        {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }
    }
}
