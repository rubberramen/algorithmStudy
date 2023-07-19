package inflearn.daily.sec2Array.day71_230719;

/* 12. 멘토링 : https://cote.inflearn.com/contest/10/problem/02-12 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prac12 {

    public static void main(String[] args) {
        Prac12 T = new Prac12();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[][] arr = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.print(T.solution(n, m, arr));

        int n = 4;
        int m = 3;
//        int[][] arr = {{3, 4, 1, 2},
//                {4, 3, 2, 1},
//                {3, 1, 4, 2},};

        int[][] arr = {{2, 1, 4, 3},
                {2, 1, 3, 4},
                {1, 2, 3, 4},};
        System.out.print(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }

    public int solution_fail(int n, int m, int[][] arr) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<int[]> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
//            int[] tmp = new int[2];
            for (int j = 0; j < n - 1; j++) {
//                int[] tmp = new int[2];
                for (int k = j + 1; k < n; k++) {
                    int[] tmp = new int[2];
                    if (i == 0) {
//                        int[] tmp = new int[2];
                        tmp[0] = arr[i][j];
                        tmp[1] = arr[i][k];
                        list.add(tmp);
                    } else {
                        tmp[0] = arr[i][j];
                        tmp[1] = arr[i][k];
                        list2.add(tmp);
                    }
                }
            }
        }

        for (int[] ints : list2) {
            for (int i = 0; i < list.size(); i++) {
                if (ints[1] == list.get(i)[0] && ints[0] == list.get(i)[1]) {
                    list.remove(list.get(i));
                }
            }
        }

        answer = list.size();
        return answer;
    }

    public int solution_test(int n, int m, int[][] arr) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<>();

//        for (int i = 1; i < n; i++) {
//            int[] tmp = {arr[0][0], i};
//            list.add(tmp);
//        }

//        for (int i = 0; i < n; i++) {
//            int[] tmp = {arr[0][i + 1], i + 1};
//        }

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int[] tmp = {arr[0][i], arr[0][j]};
//                list.add(tmp);
//            }
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int[] tmp = {arr[1][j], arr[1][i]};
//                list.remove(tmp);
//            }
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int[] tmp = {arr[2][j], arr[2][i]};
//                list.remove(tmp);
//            }
//        }

        ArrayList<int[]> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
//            int[] tmp = new int[2];
            for (int j = 0; j < n - 1; j++) {
//                int[] tmp = new int[2];
                for (int k = j + 1; k < n; k++) {
                    int[] tmp = new int[2];
                    if (i == 0) {
//                        int[] tmp = new int[2];
                        tmp[0] = arr[i][j];
                        tmp[1] = arr[i][k];
                        list.add(tmp);
                    } else {
                        tmp[0] = arr[i][j];
                        tmp[1] = arr[i][k];
                        list2.add(tmp);
                    }
                }
            }
        }

        for (int[] ints : list2) {
//            for (int[] ints1 : list) {
//                if (ints[1] == ints1[0] && ints[0] == ints1[1]) {
//                    list.remove(ints1);
//                }
//            }
            for (int i = 0; i < list.size(); i++) {
                if (ints[1] == list.get(i)[0] && ints[0] == list.get(i)[1]) {
                    list.remove(list.get(i));
                }
            }
        }

        answer = list.size();

        return answer;
    }
}
