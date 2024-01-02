package 반복제어문;

import java.util.Scanner;

public class loop1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int casenum = sc.nextInt();

            switch (casenum)
            {
                case 1:
                    System.out.println("입력하기를 선택하였습니다.");
                    break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다.");
                    break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다.");
                    break;
                case 4:
                    System.out.println("끝내기를 선택하였습니다.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("잘못 입력되었습니다.");
            }
        }

    }
}
