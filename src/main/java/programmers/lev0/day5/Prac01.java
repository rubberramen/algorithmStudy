package programmers.lev0.day5;

import java.util.Arrays;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int solution = prac01.solution(new int[]{199, 72, 222});
        System.out.println("solution = " + solution);


    }

    public int solution(int[] sides) {
        int answer = 0;

//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        int mid = 0;
//
//        for (int side : sides) {
//            if (side > max) {
//                max = side;
//            }
//            if (side < min) {
//                min = side;
//            }
//        }
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
