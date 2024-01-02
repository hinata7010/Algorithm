public class 배열2_4 {
    public static void main(String[] args) {
        int[][] number = {
            {3, 5, 4},
            {2, 6, 7},
            {8, 10, 1} };

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
