package programmers.lev0.day18_230524;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(7);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if (factorial2(i) > n) {
                answer = i - 1;
                break;
            }

            if (factorial2(i) == n) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int factorial(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }

    public int factorial2(int n) {

        if (n == 1) {
            return 1;
        } else return n * factorial2(n - 1);
    }

}
