package programmers.lev0.day10_221113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] solution = prac01.solution1(29);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution1(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(value -> value).toArray();
        return answer;
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution2(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
