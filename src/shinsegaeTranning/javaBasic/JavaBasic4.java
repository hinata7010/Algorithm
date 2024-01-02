package shinsegaeTranning.javaBasic;

public class JavaBasic4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int x = 4*i;
                int y = 5*j;
                if(x+y == 60)
                {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }

    }
}
