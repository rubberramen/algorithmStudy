package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day102_230819;

/* 12. 경로 탐색(인접행렬) :
    방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는
    프로그램을 작성하세요. 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac12 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public static void main(String[] args) {
        Prac12 T = new Prac12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v) {

    }
}