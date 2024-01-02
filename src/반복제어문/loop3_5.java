package 반복제어문;

public class loop3_5 {
    public static void main(String[] args) {
        //digital nomad의 삶이란,,,,,,,,,,, Math.random()?
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if(j > 5+i || j < 5-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
