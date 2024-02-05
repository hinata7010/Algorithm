import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        get_prime();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            int count = 0;
            for (int j = 2; j <= number / 2; j++) {
                if (!isPrime[j] && !isPrime[number - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void get_prime() {
        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (isPrime[i])
                continue;
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
    }
}
