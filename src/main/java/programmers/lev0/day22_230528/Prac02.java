package programmers.lev0.day22_230528;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(420);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isSosu(i)) {
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public boolean isSosu(int n) {
        int a = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                a++;
            }
        }

//        return a <= 0;
        return a > 0 ? false : true;
    }

    public int[] test(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
