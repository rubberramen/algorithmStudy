package programmers.lev0.day30_230605;

import java.util.Arrays;

/* OX 퀴즈 : https://school.programmers.co.kr/learn/courses/30/lessons/120907 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String[] answer = prac01.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            if (arr[1].equals("+")) {
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (arr[1].equals("-")) {
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public String[] solution_fail1(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = 0;
            String s0 = split[0];
            if (s0.contains("-")) {
                x = -Integer.parseInt(split[0]);
            } else x = Integer.parseInt(split[0]);

            int y = Integer.parseInt(split[2]);

            int z = 0;
            String s1 = split[4];
            if (s1.contains("-")) {
                z = -Integer.parseInt(split[4]);
            } else z = Integer.parseInt(split[4]);

            if (split[1].equals("+")) {
                if (x + y == z) {
                    answer[i] = "O";
                } else answer[i] = "X";
            } else {
                if (x - y == z) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }

}
