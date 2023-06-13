package inflearn.sec07.q5fibo;

public class Q5Fibo3 {

    static int[] fibo;

    public static void main(String[] args) {
        Q5Fibo3 t = new Q5Fibo3();
        int n = 45;
        fibo = new int[n + 1];
        t.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }


    private int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];  /* 메모이제이션 */
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
}
