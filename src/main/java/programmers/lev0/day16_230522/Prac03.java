package programmers.lev0.day16_230522;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(15);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (compo(i)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean compo(int n) {
        boolean answer = false;
        int a = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a >= 3) {
            answer = true;
        }
        return answer;
    }

}
