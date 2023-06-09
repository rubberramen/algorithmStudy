package programmers.lev1.day34_230609;


import java.util.Arrays;

/* 나머지가 1이 되는 수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/87389 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(12);  // 3
        System.out.println(answer);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                String test = "";
                answer = i;
                break;
            }
        }
        return answer;
    }
}
