class Solution {
    public int solution(String[] board) {
        int numX = 0, numO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') {
                    numX++;
                } else if (board[i].charAt(j) == 'O') {
                    numO++;
                }
            }
        }
        System.out.println(numO + " " + numX);
        System.out.println(numO-numX);
        if (numX > numO || numO - numX > 1) { // X가 O보다 많거나, O가 X보다 2이상 많으면 잘못된 상황
            return 0;
        }
        boolean xWin = false, oWin = false;
        for (int i = 0; i < 3; i++) {
            // 가로줄 검사
            if (board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2)) {
                if (board[i].charAt(0) == 'O') {
                    oWin = true;
                } else if (board[i].charAt(0) == 'X') {
                    xWin = true;
                }
            }
            // 세로줄 검사
            if (board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i)) {
                if (board[0].charAt(i) == 'O') {
                    oWin = true;
                } else if (board[0].charAt(i) == 'X') {
                    xWin = true;
                }
            }
        }
        // 대각선 검사
        if (board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2)) {
            if (board[0].charAt(0) == 'X') {
                xWin = true;
            } else if (board[0].charAt(0) == 'O') {
                oWin = true;
            }
        }
        if (board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0)) {
            if (board[0].charAt(2) == 'X') {
                xWin = true;
            } else if (board[0].charAt(2) == 'O') {
                oWin = true;
            }
        }
        if (xWin && oWin) { // X와 O가 동시에 이긴 경우
            return 0;
        }
        if (xWin && numX != numO) { // X가 이겼는데 O의 수와 X의 수가 같지 않은 경우
            return 0;
        }
        if (oWin && numO - numX != 1)
        {
            return 0;
        }
        return 1; // 모든 검사를 통과하면
    }
}