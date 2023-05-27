package programmers.lev0.day8;

import java.util.Arrays;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] solution = prac01.solution(new int[]{1, 8, 3});
        System.out.println("solution = " + Arrays.toString(solution));

    }

    public int[] solution(int[] array) {
        // int[] answer = {};

        int a;
        int b = 0;

        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        a = max;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                b = i;
            }
        }
        int[] answer = {a, b};
        return answer;
    }
}
