import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public String solution(int a, int b) throws ParseException {
        String answer = "";
        String day = String.valueOf(b);
        String month = String.valueOf(a);
        String[] dayofweek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        if(a < 10)
        {
            month = "0" + month;
        }
        String date1 = "2016" + month + day;
        String date2 = "20160101"; //날짜2

        Date format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);
        Date format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);

        long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
        long diffDays = diffSec / (24*60*60); //일자수 차이
        answer = dayofweek[(int) (diffDays%7)];

        return answer;
    }
}