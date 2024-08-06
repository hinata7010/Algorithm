import java.util.*;

class Solution {
    public int solution(int[] arr) {
        HashMap<Integer, Integer> primeCountMap = new HashMap<>();

        for (int num : arr) {
            HashMap<Integer, Integer> tempMap = new HashMap<>();
            int n = num;

            for (int j = 2; j <= n; j++) {
                while (n % j == 0) {
                    n /= j;
                    tempMap.put(j, tempMap.getOrDefault(j, 0) + 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
                int prime = entry.getKey();
                int count = entry.getValue();
                primeCountMap.put(prime, Math.max(primeCountMap.getOrDefault(prime, 0), count));
            }
        }

        int answer = 1;
        for (Map.Entry<Integer, Integer> entry : primeCountMap.entrySet()) {
            int prime = entry.getKey();
            int count = entry.getValue();
            answer *= Math.pow(prime, count);
        }

        return answer;
    }
}
