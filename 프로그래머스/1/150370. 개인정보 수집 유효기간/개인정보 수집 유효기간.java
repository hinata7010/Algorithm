import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (String string : terms) {
            map.put(string.charAt(0), Integer.parseInt(string.substring(2)));
        }

        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date today1 = transFormat.parse(today);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(today1);

        int count = 0;

        for (int i=0; i< privacies.length; i++) {
            String[] inputs = privacies[i].split(" ");
            String date = inputs[0];
            char ch = inputs[1].charAt(0);
            Date day = transFormat.parse(date);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(day);
            cal2.add(Calendar.MONTH, map.get(ch));
            if (cal1.compareTo(cal2) >= 0) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        count = 0;

        for (int n : list) {
            answer[count++] = n;
        }

        return answer;
    }
}
