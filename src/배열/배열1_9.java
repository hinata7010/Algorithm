import java.util.Arrays;
import java.util.Scanner;

public class 배열1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {95, 75, 85, 100, 50};
        Arrays.sort(numbers);

        for (int i = 0; i < 5; i++) {
            if(numbers.length != 4)
            {
                System.out.print(numbers[i] + " ");
            }
            else
            {
                System.out.print(numbers[i]);
            }
        }
    }
}
