package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {
        drawA(5);
    }

    public static void drawA(int num)
    {
        for (int i = 0; i < num; i++) {
            int n, m;
            n = num / 2;
            if(i < n)
            {
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < num - 2*(n-i); j++) {
                    System.out.print("@");
                }
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
            }
            else
            {
                for (int j = 0; j < i-n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < num - 2*(i - n); j++) {
                    System.out.print("@");
                }
                for (int j = 0; j < i-n; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
