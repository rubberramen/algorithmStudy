package programmers.lev1.day33_230608;

import java.util.ArrayList;
import java.util.List;

/* 약수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/12928 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution1(12);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        List<Integer> aaa = aaa(n);
        for (Integer integer : aaa) {
            answer += integer;
        }

        return answer;
    }

    public List<Integer> aaa(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public int solution1(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        for (Integer integer : list) {
            answer += integer;
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }

    public int solution3(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) answer += i;
        }
        return answer + n;
    }
}
