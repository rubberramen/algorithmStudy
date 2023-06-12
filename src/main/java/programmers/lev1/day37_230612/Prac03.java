package programmers.lev1.day37_230612;


/* 하샤드 수 : https://school.programmers.co.kr/learn/courses/30/lessons/12947 */

/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
*/

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        long answer = prac01.solution(3, 5);   //true
        System.out.println("answer = " + answer);
    }

    public long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}
