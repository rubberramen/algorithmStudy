package programmers.lev0.day19_230525;

import java.util.Arrays;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[][] answer = prac01.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        System.out.println("answer = " + Arrays.deepToString(answer));
    }

    public int[][] solution(int[] num_list, int n) {

        int m = num_list.length / n;
        int[][] answer = new int[m][n];

        int a = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[a];
                a++;
            }
        }

        return answer;
    }

}
