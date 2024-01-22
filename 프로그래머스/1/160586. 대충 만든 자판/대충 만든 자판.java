class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int k = 0; k < targets.length; k++) {
            String target = targets[k];
            int keyPresses = 0;

            for (int i = 0; i < target.length(); i++) {
                char currentChar = target.charAt(i);
                int minKeyPresses = Integer.MAX_VALUE;

                for (String key : keymap) {
                    int keyPressIndex = key.indexOf(currentChar);
                    if (keyPressIndex != -1) {
                        minKeyPresses = Math.min(minKeyPresses, keyPressIndex + 1);
                    }
                }

                if (minKeyPresses == Integer.MAX_VALUE) {
                    keyPresses = -1; // 문자열을 작성할 수 없는 경우
                    break;
                }

                keyPresses += minKeyPresses;
            }

            answer[k] = keyPresses;
        }
        return answer;
    }
}
