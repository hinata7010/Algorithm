import java.util.Scanner;

public class 배열2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        int[][] first = new int[3][3];
        int[][] second = new int[3][3];

        for (int i = 0; i < 3; i++) {
            string = sc.nextLine();
            int begin = 11;
            int end = 12;
            for (int j = 0; j < 3; j++) {
                first[i][j] = Integer.parseInt(string.substring(begin, end));
                begin = begin + 2;
                end = end + 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            string = sc.nextLine();
            int begin = 11;
            int end = 12;
            for (int j = 0; j < 3; j++) {
                second[i][j] = Integer.parseInt(string.substring(begin, end));
                begin = begin + 2;
                end = end + 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(first[i][j] + second[i][j] + " ");
            }
            System.out.println();
        }
    }
}
