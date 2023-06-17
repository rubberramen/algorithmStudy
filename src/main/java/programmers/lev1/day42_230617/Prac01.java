package programmers.lev1.day42_230617;


import java.util.Arrays;

/* 최대공약수와 최소공배수 : https://school.programmers.co.kr/learn/courses/30/lessons/12940 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(3, 12);   // false
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcp = gcp(n, m);
        int lcm = lcm(n, m);

        answer[0] = gcp;
        answer[1] = lcm;

        return answer;
    }

    public int gcp(int n, int m) {
        int gcp = 0;
        for (int i = 1; i <= Math.max(n, m); i++) {
            if (n % i == 0 & m % i == 0) {
                gcp = i;
            }
        }
        return gcp;
    }

    public int lcm(int n, int m) {
        int gcp = gcp(n, m);
        int lcm = n * m / gcp;
        return lcm;
    }

}
