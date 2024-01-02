import java.util.Scanner;

public class 배열1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int length = 0;

        for (int i = 0; i < 100; i++) {
            int number = sc.nextInt();
            if(number != 0)
            {
                numbers[i] = number;
            }
            else
            {
                length = i;
                break;
            }
        }

        if(length != 0)
        {
            for (int i = 1; i < length; i+=2) {
                System.out.print(numbers[i] + " ");
            }
        }
        else
        {
            for (int i = 1; i < numbers.length; i+=2) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
