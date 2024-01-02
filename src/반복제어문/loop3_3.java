package 반복제어문;

public class loop3_3 {
    public static void main(String[] args) {
        drawstar(6);
    }

    public static void drawstar(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if(i <= 2)
            {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            else
            {
                for (int j = 0; j <n-i-1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
