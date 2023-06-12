package programmers.lev1.day37_230612;


import java.util.Arrays;
import java.util.Collections;

/* 정수 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12933 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        long answer = prac01.solution(118372);   //873211
        System.out.println("answer = " + answer);
    }

    public long solution(long n) {

        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder tmp = new StringBuilder();
        for (String s1 : split) {
            tmp.append(s1);
        }

        return Long.parseLong(tmp.toString());
    }

    public long solution1(long n) {
        long answer = 0;

        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Collections.reverseOrder());

        String tmp = "";
        for (String s1 : split) {
            tmp += s1;
        }

        Long aLong = Long.valueOf(tmp);
        answer = aLong;

        return answer;
    }
}
