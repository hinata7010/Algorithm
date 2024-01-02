public class 배열1_2 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) ('A' + i);
        }

        for (int i = alphabets.length-1; i >= 0; i--) {
            if(i == 0)
            {
                System.out.println(alphabets[i]);
            }
            else
            {
                System.out.print(alphabets[i] + " ");
            }
        }
    }
}
