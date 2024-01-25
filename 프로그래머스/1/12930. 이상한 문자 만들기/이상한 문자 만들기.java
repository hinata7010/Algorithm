class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ", -1);
        for (int i = 0; i < strings.length; i++) {
            boolean flag = true;
            for (int j = 0; j < strings[i].length(); j++) {
                if(strings[i].charAt(j) == ' ')
                {
                    flag = false;
                    continue;
                }
                if(j % 2 == 0)
                {
                    answer += String.valueOf(strings[i].charAt(j)).toUpperCase();
                }
                else
                {
                    answer += String.valueOf(strings[i].charAt(j)).toLowerCase();
                }
            }
            if(flag && i < strings.length-1)
            {
                answer += " ";
            }
        }
        return answer;
    }
}