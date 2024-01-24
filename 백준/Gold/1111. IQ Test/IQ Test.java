import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }
        if(N == 1) // 숫자가 하나만 있는경우 판별 불가
        {
            System.out.println("A");
        }
        else if(N == 2)
        {
            if(numbers[0] == numbers[1]) // 1, 2가 같은경우
            {
                System.out.println(numbers[1]);
            }
            else
            {
                System.out.println("A"); // 1,2가 다른경우 판단 불가
            }
        }
        else // n>3인 경우
        {
            boolean flag = true;
            if(numbers[1] - numbers[0] == 0 && numbers[2] - numbers[1] == 0) // 1,2,3이 같은경우
            {
                for (int i = 0; i < N - 1; i++) {
                    if(numbers[i] != numbers[i+1])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag) // 모든 수가 같은경우
                {
                    System.out.println(numbers[0]);
                }
                else // 모든수가 같지 않은 경우
                {
                    System.out.println("B");
                }
            }
            else // n>3이고 앞의 예외조건에 해당하지 않는 경우
            {
                double a = (double)(numbers[2]-numbers[1]) / (double)(numbers[1] - numbers[0]); // 점화식 이용하여 구한 a
                int b = numbers[2] - (int)(numbers[1] * a);
                if(a % 1 != 0)
                {
                    System.out.println("B");
                    return;
                }
                flag = true;

                for (int i = 2; i < N-1; i++) {
                    if(numbers[i+1] != numbers[i] * a + b)
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println(numbers[N-1] * (int)a + b);
                }
                else
                {
                    System.out.println("B");
                }
            }

        }
    }
}
