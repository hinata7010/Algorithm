class Main {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String String1 = my_string.substring(0, s);
        String String2 = my_string.substring(s+overwrite_string.length());
        return String1 + overwrite_string + String2;
    }

    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.solution("hahahahahahahahha", "youretoslow", 4));
    }
}
