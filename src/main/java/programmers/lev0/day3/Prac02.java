package programmers.lev0.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] solution = prac01.solution(new int[]{1, 3, 5, 7});
        // System.out.println("solution = " + Arrays.toString(solution));
        System.out.println("solution = " + Arrays.toString(solution));

    }

    public int[] solution(int[] num_list) {
//        int[] answer = {};
//        int count = (int) Arrays.stream(num_list).filter(value ->
//                value % 2 == 0).count();
//
//        answer = new int[]{count, num_list.length-count};
//        return answer;
        return IntStream.of((int) Arrays.stream(num_list).filter(i -> i%2==0).count(), (int) Arrays.stream(num_list).filter(i -> i%2!=0).count() ).toArray();

    }
}
