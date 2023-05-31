package programmers.lev0.day26_230601;

/* 종이 자르기 : https://school.programmers.co.kr/learn/courses/30/lessons/120922 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(2, 5);
        System.out.println("answer = " + answer);
    }

    public int solution(int M, int N) {
        return (M-1) + M * (N -1);
    }

    public int solution1(int M, int N) {
        int answer = 0;

        int a = M - 1;
        int b = N - 1;

        int c = (a + 1) * b;

        answer = a + c;

        return answer;
    }
}
