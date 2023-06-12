package programmers.lev1.day37_230612;


/* 하샤드 수 : https://school.programmers.co.kr/learn/courses/30/lessons/12947 */

/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
*/

public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int answer = prac01.solution(1);   // 8
        System.out.println("answer = " + answer);
    }
    public int solution(long num) {
        int answer = 0;

        if (num == 1) return -0;

        while (num > 1) {
            if (answer == 500) return -1;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
             answer++;
        }
        return answer;
    }
}
