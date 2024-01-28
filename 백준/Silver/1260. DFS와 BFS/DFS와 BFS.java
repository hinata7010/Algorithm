import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점
        int M = sc.nextInt(); // 간선
        int V = sc.nextInt(); // 시작 정점 번호

        int[][] a = new int[N + 1][N + 1];
        boolean[] c = new boolean[N + 1];

        // 인접행렬 만들기
        for (int i = 0; i < M; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            a[a1][a2] = 1;
            a[a2][a1] = 1;
        }

        dfs(a, c, V);
        System.out.println();

        Arrays.fill(c, false);
        bfs(a, c, V);

    }

    //bfs
    //큐 사용
    private static void bfs(int[][] a, boolean[] c, int v) {
        Queue<Integer> q = new LinkedList<Integer>();
        int n = a.length - 1;
        q.add(v);
        c[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");

            for (int i = 1; i <= n; i++) {
                if (a[v][i] == 1 && !c[i]) {
                    q.add(i);
                    c[i] = true;
                }
            }

        }
    }

    //재귀
    private static void dfs(int[][] a, boolean[] c, int v) {
        int n = a.length - 1;
        c[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (a[v][i] == 1 && !c[i]) {
                dfs(a, c, i);
            }
        }
    }
}