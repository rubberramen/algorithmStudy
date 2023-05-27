package programmers.lev0.day22_230528;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(new int[]{10, 29});
        System.out.println("answer = " + answer);
    }

    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            while (a > 0) {
                if (a % 10 == 7) {
                    answer++;
                }
                a /= 10;
            }
        }

        return answer;
    }

    public int solution1(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            while (a > 0) {
                if (a % 10 == 7) {
                    answer++;
                }
                a /= 10;
            }
        }

        return answer;
    }
}
