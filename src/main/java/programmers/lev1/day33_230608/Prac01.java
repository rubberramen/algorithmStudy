package programmers.lev1.day33_230608;


/* 자릿수 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12931 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(987);
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        String[] split = str.split("");

        for (String s : split) {
            int i = Integer.parseInt(s);
            answer += i;
        }
        return answer;
    }

    public int solution1(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;
            if (n < 10) break;
            n = n / 10;
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;
            if (n < 10) break;
            n /= 10;
        }

        return answer;
    }
}
