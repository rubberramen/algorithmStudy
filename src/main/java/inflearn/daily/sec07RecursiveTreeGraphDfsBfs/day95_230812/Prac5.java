package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day95_230812;

/* 5. 이진트리 순회(깊이우선탐색) :
*/

public class Prac5 {

    static int[] fibo;

    public static void main(String[] args) {
        Prac5 T = new Prac5();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);  // 배열에 다 기록됨.
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }

    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];  // 여기가 시간 단축의 핵심.

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
}