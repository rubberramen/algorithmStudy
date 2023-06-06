package programmers.lev0.day31_230606;

import java.util.Arrays;

/* 겹치는 선분의 길이 : https://school.programmers.co.kr/learn/courses/30/lessons/120876 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        System.out.println("answer = " + answer);
    }

    public int solution(int[][] lines) {
        int[] rail = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        int answer = 0;
        for (int value : rail) {
            if (value > 1) answer++;
        }
        return answer;
    }

}
