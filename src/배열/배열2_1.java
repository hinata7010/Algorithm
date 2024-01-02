import java.util.Scanner;

public class 배열2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbercheck = new int[11];
        for (int i = 0; i < 11; i++) {
            numbercheck[i] = 0;
        }

        while(true)
        {
            int number = sc.nextInt();
            if(number > 0 && number <= 10)
            {
                numbercheck[number]++;
            }
            else
            {
                break;
            }
        }

        for (int i = 0; i < 11; i++) {
            if(numbercheck[i] != 0)
            {
                System.out.println(i + " : " + numbercheck[i] + "개");
            }
        }
    }
}
