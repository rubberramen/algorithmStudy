package programmers.lev1.day51_230626;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 과일 장수: https://school.programmers.co.kr/learn/courses/30/lessons/135808 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});   // 8
        System.out.println("answer = " + answer);
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }

        Collections.sort(list, Collections.reverseOrder());
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            tmp.add(list.get(i));
            if (tmp.size() == m) {
                answer += tmp.get(tmp.size() - 1) * tmp.size();
                tmp.clear();
            }
        }
        return answer;
    }

    public int solution1(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}