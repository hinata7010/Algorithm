package 문자열;

import java.util.Scanner;

public class 문자열1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        for (int i = 1; i <= string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if(j+i >= string.length())
                {
                    System.out.print(string.charAt(Math.abs(string.length()-j-i)));
                }
                else
                {
                    System.out.print(string.charAt(j+i));
                }
                // 만약에 charAt(10)되면 안되니까 charAt 10이되면
                // 난 charAt(0)로 바꿔줄래 그럴려면 만약에
            }
            System.out.println();
        }


    }
}
