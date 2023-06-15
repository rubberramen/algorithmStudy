package programmers.lev1.day40_230615;


import java.util.Arrays;
import java.util.Collections;

/* 문자열 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12917 */
public class Prac05 {
    public static void main(String[] args) {
        Prac05 prac01 = new Prac05();
        String answer = prac01.solution("Zbcdefg");   // "수박수"
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        String answer = "";

        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        for (String s1 : split) {
            answer += s1;
        }

        return answer;
    }
}
