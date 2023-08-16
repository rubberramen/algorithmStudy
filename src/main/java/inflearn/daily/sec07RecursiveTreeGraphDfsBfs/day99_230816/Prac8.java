package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day99_230816;

/* 8. 송아지 찾기(BFS : 상태트리탐색) :
    현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
    현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면
    현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
    송아지는 움직이지 않고 제자리에 있다.
    현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
    최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac8 {

//    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;   // 체크 배열 : 한번 갔던 곳 체크
    Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Prac8 T = new Prac8();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
//        int s = 8;  // 5
//        int e = 3;  // 14
        System.out.println(T.BFS(s, e));
    }

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;    // 출발 지점.
        Q.offer(s);   // 방문한 곳 que에 넣기
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();   // 1레벨에서는 3개가 들어감. - 레벨에 있는 원소의 갯수.
            for (int i = 0; i < len; i++) {
                // 부모노드
                int x = Q.poll();

//                if (x == e) {
//                    return L;
//                }

                for (int j = 0; j < 3; j++) {   // int[] dis = {1, -1, 5};
                    // next
                    int nx = x + dis[j];

                    if (nx == e) {
                        return L + 1;
                    }

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {  // 방문 안한 것.
                        ch[nx] = 1;
                        Q.offer(nx);  // 방문한 곳 que에 넣기
                    }
                }
            }
            L++;
        }
        return 0;
    }
}