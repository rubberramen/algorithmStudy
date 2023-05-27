package programmers.lev0.day12_230518;

import java.util.Arrays;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution2(new int[]{10, 20, 30, 5, 5, 20, 5});
        System.out.println("answer = " + answer);
    }

    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (max < numbers[i] * numbers[j]) {
                        max = numbers[i] * numbers[j];
                    }
                }
            }
        }
        return max;
    }

    public int solution2(int[] numbers) {
        Arrays.sort(numbers);
        int max = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1]);
        return max;
    }

}
