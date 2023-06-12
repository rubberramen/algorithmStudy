package inflearn.sec07.q5fibo;

public class Q5Fibo1 {

    public static void main(String[] args) {
        Q5Fibo1 t = new Q5Fibo1();
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(t.DFS(i) + " ");
        }
    }

    private int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }
}
