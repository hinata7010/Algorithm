import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class 배열1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if(i == 4)
            {
                System.out.println(number[i]);
            }
            else
            {
                System.out.print(number[i] + " ");
            }
        }


    }
}