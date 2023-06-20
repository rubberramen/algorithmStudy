package programmers.lev1.day45_230620;


import java.util.Arrays;

/* 크기가 작은 부분문자열 : https://school.programmers.co.kr/learn/courses/30/lessons/147355 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution("500220839878", "7");   // 3
        System.out.println("answer = " + answer);
    }

    public int solution(String t, String p) {
        int answer = 0;

        long pi = Long.parseLong(p);
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String substring = t.substring(i, i + p.length());
            long i1 = Long.parseLong(substring);
            if (i1 <= pi) answer++;
        }

        return answer;
    }

    public int solution_fail(String t, String p) {   // 런타임 에러
        int answer = 0;
        int pLength = p.length();

        StringBuilder tSb = new StringBuilder(t);

        int pi = Integer.parseInt(p);
        for (int i = 0; i < t.length() - pLength + 1; i++) {
            String substring = tSb.substring(i, i + pLength);
            int i1 = Integer.parseInt(substring);
            if (i1 <= pi) answer++;
        }

        return answer;
    }



}
