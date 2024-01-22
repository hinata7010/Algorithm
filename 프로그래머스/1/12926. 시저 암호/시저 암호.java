class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char space = ' ';
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != space)
            {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                {
                    if(s.charAt(i) + n <= 90)
                    {
                        answer = answer + (char)(s.charAt(i)+n);
                    }
                    else
                    {
                        answer = answer + (char)(s.charAt(i)+n- 26);
                    }
                }
                else
                {
                    if(s.charAt(i) + n <= 122)
                    {
                        answer = answer + (char)(s.charAt(i)+n);
                    }
                    else
                    {
                        answer = answer + (char)(s.charAt(i)+n- 26);
                    }
                }
            }
            else
            {
                answer = answer + space;
            }
        }
        return answer;
    }
}