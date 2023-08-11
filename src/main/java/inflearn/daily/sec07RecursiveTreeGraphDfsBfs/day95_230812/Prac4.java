package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day95_230812;

/* 4. 피보나치 수열 :
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
*/

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
        int n = 10;
        for (int i = 1; i <= n; i++) System.out.print(T.fibo(i) + " ");
    }

    public int fibo(int n) {
        return 1;
    }
}