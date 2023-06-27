package programmers.lev1.day52_230627;


/* 소수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/12921 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(5);   // 3
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                answer++;
            }
        }

        return answer;
    }

    public int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}