package programmers.lev2.day58_230703;


import java.util.Arrays;

/* 최솟값 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12941 */
public class Prac01Prac {
    public static void main(String[] args) {
        Prac01Prac prac01 = new Prac01Prac();
        int answer = prac01.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});   // 37
        System.out.println("answer = " + answer);
    }

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - 1 - i];
        }

        return answer;
    }
}