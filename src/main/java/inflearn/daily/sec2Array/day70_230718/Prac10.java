package inflearn.daily.sec2Array.day70_230718;

/* 10. 봉우리 : https://cote.inflearn.com/contest/10/problem/02-10 */

import java.util.Scanner;

public class Prac10 {

    public static void main(String[] args) {
        Prac10 T = new Prac10();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }

        int n = 5;
        int[][] arr = {{5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}};
        System.out.print(T.solution2(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[][] tmp = new int[n + 2][n + 2];
//        System.out.println(Arrays.deepToString(tmp));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i + 1][j + 1] = arr[i][j];
            }
        }

//        for (int i = 0; i < tmp.length; i++) {
//            System.out.println(Arrays.toString(tmp[i]));
//        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (tmp[i][j] > tmp[i - 1][j] && tmp[i][j] > tmp[i][j - 1] &&
                        tmp[i][j] > tmp[i][j + 1] && tmp[i][j] > tmp[i + 1][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // 방향 배열
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution2(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 경계선 확인 로직도 추가.
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

}
