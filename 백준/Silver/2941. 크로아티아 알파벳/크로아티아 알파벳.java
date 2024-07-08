import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();
        alphabet = alphabet.replace("dz=", "0");
        alphabet = alphabet.replace("lj", "0");
        alphabet = alphabet.replace("nj", "0");
        alphabet = alphabet.replace("c=", "0");
        alphabet = alphabet.replace("c-", "0");
        alphabet = alphabet.replace("d-", "0");
        alphabet = alphabet.replace("s=", "0");
        alphabet = alphabet.replace("z=", "0");
        int count = alphabet.length();

        System.out.print(count);
    }
}