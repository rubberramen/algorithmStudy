package inflearn.sec07;

public class Q1Requr {

    public static void main(String[] args){
        Q1Requr T = new Q1Requr();
        T.solution(3);
    }

    public void DFS(int n){

        if (n == 0) return;
        else {
//            System.out.print(n + " ");
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public void solution(int n){
        DFS(n);
    }

    public void solutionTest(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    
}
