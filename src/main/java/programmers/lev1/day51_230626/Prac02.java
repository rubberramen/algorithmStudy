package programmers.lev1.day51_230626;


import java.util.*;

/* 명예의 전당 (1): https://school.programmers.co.kr/learn/courses/30/lessons/138477 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});   // 2
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());

            if (i < k) {
                answer[i] = list.get(i);
            } else {
                answer[i] = list.get(k - 1);
            }
        }
        return answer;
    }
}