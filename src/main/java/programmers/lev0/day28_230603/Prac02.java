package programmers.lev0.day28_230603;

import java.util.*;

/* 저주의 숫자3 : https://school.programmers.co.kr/learn/courses/30/lessons/120871 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution2(40);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = n;
        for (int i = 1; i <= answer; i++) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
        }
        return answer;
    }



    public int solution_fail2(int n) {
        int answer = 0;


        for (int i = 1; i <= n; i++) {
            answer++;

            if (answer % 3 == 0) {
                answer++;
            }

            String[] split = String.valueOf(answer).split("");
            List<String> strings = Arrays.asList(split);
            if (strings.contains("3")) {
                answer++;
            }
        }

        String[] split = String.valueOf(answer).split("");
        List<String> strings = Arrays.asList(split);
        if (answer % 3 == 0 || strings.contains("3")) {
            answer++;
        }

        return answer;
    }


    public int solution_fail1(int n) {
        int answer = 0;

        int test = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                test++;
            }
        }

        answer = n + test;
        return answer;
    }

}
