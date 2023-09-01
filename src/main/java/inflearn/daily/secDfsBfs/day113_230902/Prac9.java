package inflearn.daily.secDfsBfs.day113_230902;

/* 8. 수열 추측하기 :
    가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼
의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다. 예를 들어 N이 4 이고 가장 윗 줄에 3
1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
                            3 1 2 4
                            4 3 6
                            7 9
                            16
N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하
시오. 단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
 */

import java.util.Scanner;

public class Prac9 {

    static int[] combi;
    static int n, m;

    public static void main(String[] args) {
        Prac9 T = new Prac9();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }

    public void DFS(int L, int s) {

    }
}