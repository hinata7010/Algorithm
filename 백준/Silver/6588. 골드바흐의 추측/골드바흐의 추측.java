import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) throws IOException, NumberFormatException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int n = Integer.parseInt(in.readLine());

        while (n != 0) {
            boolean flag = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
            n = Integer.parseInt(in.readLine());
        }

    }

        public static void get_prime () {
            isPrime[0] = isPrime[1] = true;

            for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
                if (isPrime[i])
                    continue;
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }

}