package programmers.lev0.day15_230521;

import java.util.Arrays;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(29423);
        System.out.println("answer = " + answer);
    }

    public int solution(int order) {
        int answer = 0;

        while (order > 0) {
            int i = order % 10;
            if (i == 3 || i == 6 || i == 9) {
                answer += 1;
            }

            order = order / 10;
        }

        return answer;
    }

    public int solution1(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }

}
