package 반복제어문;

public class loop3_7 {
    public static void main(String[] args) {
        int count = 1;
        char alphabets = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j <= i)
                {
                    System.out.print((alphabets++) + " ");
                }
                else
                {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}
