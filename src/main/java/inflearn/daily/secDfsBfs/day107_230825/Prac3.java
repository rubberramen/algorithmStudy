package inflearn.daily.secDfsBfs.day107_230825;

/* 3. 최대점수 구하기(DFS) :
    이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
    각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
    제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
    (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
*/

import java.util.Scanner;

public class Prac3 {

    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;

    public static void main(String[] args) {
        Prac3 T = new Prac3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {

    }
}