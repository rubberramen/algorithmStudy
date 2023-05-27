package programmers.lev0.day15_230521;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(10);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        int gcd = gcd1(6, n);
        int lcm = (6 * n) / gcd;

        answer = lcm / 6;

        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지를 구해준다.
            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }

    public int gcd1(int n1, int n2) {
        int min = n1 >= n2 ? n2 : n1;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

}
