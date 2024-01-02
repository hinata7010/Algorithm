package 반복제어문;

public class loop3_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
