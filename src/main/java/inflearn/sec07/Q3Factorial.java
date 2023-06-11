package inflearn.sec07;

public class Q3Factorial {

    public static void main(String[] args) {
        Q3Factorial T = new Q3Factorial();
        System.out.println(T.DFS(5));
    }

    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }
}
