package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어 5개를 입력하세요.");
        AsciiString[] asciiStrings = new AsciiString[5];
        for (int i = 0; i < 5; i++) {
            asciiStrings[i] = new AsciiString(sc.nextLine());
        }
        Arrays.sort(asciiStrings);

        for (AsciiString asciiString : asciiStrings) {
            System.out.println(asciiString.toString());
        }
    }

    static class AsciiString implements Comparable<AsciiString>
    {
        String string;

        AsciiString(String string)
        {
            this.string = string;
        }

        @Override
        public int compareTo(AsciiString o) {
            return this.string.charAt(0) - o.string.charAt(0);
        }

        public String toString()
        {
            return string;
        }
    }
}
