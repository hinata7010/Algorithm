import java.util.Scanner;

public class 배열1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenmax = Integer.MIN_VALUE, oddmin = Integer.MAX_VALUE;
        int number;

        for (int i = 0; i < 10; i++) {
            number = sc.nextInt();
            if(number % 2 == 0)
            {
                if(number > evenmax)
                {
                    evenmax = number;
                }
            }
            else
            {
                if(number < oddmin)
                {
                    oddmin = number;
                }
            }
        }

        System.out.println(oddmin + " " + evenmax);
    }
}
