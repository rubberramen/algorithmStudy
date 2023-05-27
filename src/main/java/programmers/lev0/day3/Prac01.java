package programmers.lev0.day3;

import java.util.Arrays;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int solution = prac01.solution(new int[]{180, 120, 140}, 190);
        System.out.println("solution = " + solution);


    }

    public int solution(int[] array, int height) {
//        int answer = 0;
//        for (int i : array) {
//            if (i > height) {
//                answer++;
//            }
//        }
//        return answer;

//        Object collect = Arrays.stream(array).filter(value -> value > height).count();
        int answer = (int) Arrays.stream(array).filter(value -> value > height).count();
//        return (int) Arrays.stream(array).filter(value -> value > height).count();
        return answer;
    }
}
