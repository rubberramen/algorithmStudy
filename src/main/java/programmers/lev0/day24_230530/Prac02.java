package programmers.lev0.day24_230530;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(5, 3);
        System.out.println("answer = " + answer);
    }

    public int solution(int balls, int share) {
        return factorial2(balls) / (factorial2(share) * factorial2(balls - share));
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public int factorial2(int n) {
        int answer = 1;
        for (int i = 1; i <= n ; i++) {
            answer *= i;
        }
        return answer;
    }

}
