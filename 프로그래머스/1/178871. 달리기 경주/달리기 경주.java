import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<Integer,String> map = new TreeMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<players.length;i++){
            map.put(i+1,players[i]);
            map2.put(players[i],i+1);
        }

        for(int i=0;i<callings.length;i++){

            //추월한 선수
            String callplayer = callings[i];

            int count =map2.get(callplayer);

            //뒤처진 선수
            String prevplayer = map.get(count-1);

            //map2  갱신
            map2.put(callplayer,count-1);
            map2.put(prevplayer,count);

            //map1 갱신
            map.put(count-1,callplayer);
            map.put(count,prevplayer);

        }

        int count=0;
        for(int key:map.keySet()){
            answer[count++]=map.get(key);
        }



        return answer;
    }
}
