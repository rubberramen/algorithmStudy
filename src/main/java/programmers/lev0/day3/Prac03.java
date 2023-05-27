package programmers.lev0.day3;

import java.util.Arrays;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac03 = new Prac03();
        int[] solution = prac03.solution(new int[]{1, 0, 1, 1, 1, 3, 5});
        System.out.println("solution = " + Arrays.toString(solution));


    }

    public int[] solution(int[] num_list) {
//        int[] answer = {};
//        answer = new int[num_list.length];
//
//        for (int i = 0; i < num_list.length; i++) {
//            answer[i] = num_list[num_list.length-(i+1)];
//        }
//
//        return answer;

        Arrays.sort(num_list);
        return num_list;
    }
}
