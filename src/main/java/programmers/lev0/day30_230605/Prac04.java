package programmers.lev0.day30_230605;

import java.util.Arrays;

/* 연속된 수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/120923 */
public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int[] answer = prac01.solution1(5, 15);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = (total - aaa(num)) / num;
        for (int i = 0; i < num; i++) {
            answer[i] = a;
            a++;
        }
        return answer;
    }

    public int aaa(int n) {
        if (n == 1) return 0;
        else return aaa(n - 1) + (n - 1);
    }

    // ---------------------------------------------

    public int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1) / 2;
        int start = (total - check) / num + 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i ;
        }
        return answer;
    }

}
