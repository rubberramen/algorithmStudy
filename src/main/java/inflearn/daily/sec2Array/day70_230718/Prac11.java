package inflearn.daily.sec2Array.day70_230718;

/* 11. 임시반장 정하기 : https://cote.inflearn.com/contest/10/problem/02-11 */

public class Prac11 {

    public static void main(String[] args) {
        Prac11 T = new Prac11();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }

        int n = 5;
        int[][] arr = {{2, 3, 1, 7, 3},
                {4, 1, 9, 6, 8},
                {5, 5, 2, 4, 4},
                {6, 5, 2, 6, 7},
                {8, 4, 2, 2, 2}};
        System.out.print(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        // 4번 학생이 같은 반이었던 학생 수
        for (int i = 0; i < n; i++) {
            test : for (int j = 0; j < n; j++) {
                if (i == 3) {
                    continue test;
                } else {
                    if (arr[3][j] == arr[i][j]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
