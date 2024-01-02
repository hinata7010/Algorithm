package 반복제어문;

public class loop1_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while(num <= 10)
        {
            sum += num;
            num++;
        }

        System.out.println("1부터 10까지의 합 = " + sum);
        System.out.println("while문이 끝난 후 num의 값 = " + num);
    }
}
