package programmers.lev0.day27_230602;

import java.util.Arrays;

/* 등수 매기기 : https://school.programmers.co.kr/learn/courses/30/lessons/120882 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        int[] avg = new int[score.length];
        for (int i = 0; i < avg.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2;
        }

        String test = "";

        return answer;
    }

}
