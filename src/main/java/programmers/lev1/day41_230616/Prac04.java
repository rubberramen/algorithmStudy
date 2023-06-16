package programmers.lev1.day41_230616;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 행렬의 덧셈 : https://school.programmers.co.kr/learn/courses/30/lessons/12950 */
public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int[][] answer = prac01.solution(new int[][]{{1, 2}, {2,3}}, new int[][]{{3, 4}, {5,6}});   // false
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public int[][] solution_good(int[][] arr1, int[][] arr2) {
        for(int i=0 ; i<arr1.length ; i++) {
            for(int j=0 ; j<arr1[0].length ; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}
