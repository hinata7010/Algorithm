import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        String answer = "";
        Map<String, Integer> engNumber = new HashMap<>();
        engNumber.put("zero", 0);
        engNumber.put("one", 1);
        engNumber.put("two", 2);
        engNumber.put("three", 3);
        engNumber.put("four", 4);
        engNumber.put("five", 5);
        engNumber.put("six", 6);
        engNumber.put("seven", 7);
        engNumber.put("eight", 8);
        engNumber.put("nine", 9);

        StringBuilder currentWord = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer += ch;
            } else {
                currentWord.append(ch);
                if (engNumber.containsKey(currentWord.toString())) {
                    answer += engNumber.get(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        return Integer.parseInt(answer);
    }
}