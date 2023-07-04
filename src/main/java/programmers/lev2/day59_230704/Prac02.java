package programmers.lev2.day59_230704;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 숫자의 표현: https://school.programmers.co.kr/learn/courses/30/lessons/12924 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(15);   // 4
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}