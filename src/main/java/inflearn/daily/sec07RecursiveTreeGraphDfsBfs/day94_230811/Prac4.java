package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day94_230811;

/* 4. 피보나치 수열 :
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
*/

public class Prac4 {
//    public static void main(String[] args) {
//        Prac4 T = new Prac4();
//        int n = 10;
//        for (int i = 1; i <= n; i++) System.out.print(T.fibo(i) + " ");
//    }
//
//    public int fibo(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 1;
//        } else {
//            return fibo(n - 2) + fibo(n - 1);
//        }
//    }

    static int[] fibo;

    public static void main(String[] args) {
        Prac4 T = new Prac4();
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