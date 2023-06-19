package programmers.lev1.day44_230619;


import java.util.Arrays;

/* 예산 : https://school.programmers.co.kr/learn/courses/30/lessons/12982 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[]{2, 2, 3, 3}, 10);   // 3
        System.out.println("answer = " + answer);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i : d) {
            budget -= i;
            if (budget >= 0) {
                answer++;
            }
        }
        return answer;
    }
}
