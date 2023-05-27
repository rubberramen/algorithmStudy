package programmers.lev0.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac05 {
    public static void main(String[] args) {
        Prac05 prac03 = new Prac05();
        int[] solution = prac03.solution(15);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        int size = list.size();

        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }


}
