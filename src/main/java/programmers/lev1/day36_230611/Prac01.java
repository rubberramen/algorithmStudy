package programmers.lev1.day36_230611;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 자연수 뒤집어 배열로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12932 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        long answer = prac01.solution(144);
        System.out.println("answer = " + answer);
    }

    public long solution(long n) {
        long answer = 0;

        while (answer * answer < n) {
            answer++;
        }

        if ((answer * answer) == n) {
            answer++;
            answer *= answer;
        } else answer = -1;

        return answer;
    }

    public long solution1(long n) {
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }

    public long solution_fail(long n) {
        long answer = 0;
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            if ((i * i) == n) {
                tmp = i;
                break;
            }
        }

        if (tmp != 0) {
            answer = (long) (tmp + 1) * (tmp + 1);
        } else answer = -1;

        return answer;
    }

    public long solution_fail2(long n) {
        long answer = 0;

        long sqrt = (long) Math.sqrt(n);

//        int i = sqrt ^ 2;
//        long l = (long) sqrt ^ 2;

        if ((sqrt ^ 2) == n) {
            answer = (sqrt + 1) ^ 2;
        } else if (((sqrt + 1) ^ 2) == n) {
            answer = (sqrt + 2) ^ 2;
        } else answer = -1;

        return answer;
    }
}
