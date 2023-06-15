package programmers.lev1.day40_230615;


import java.util.ArrayList;
import java.util.List;

/* 약수의 개수와 덧셈 : https://school.programmers.co.kr/learn/courses/30/lessons/77884 */
public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int answer = prac01.solution(13, 17);   // "수박수"
        System.out.println("answer = " + answer);
    }

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int num = num(i);
            if (num % 2 == 0) {
                answer += i;
            } else answer -= i;
        }

        return answer;
    }

    public int num(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.size();
    }
}
