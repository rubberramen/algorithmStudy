package programmers.lev0.day19_230525;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(new int[]{10, 11, 12, 14}, 13);
        System.out.println("answer = " + answer);
    }

//    public int solution(int[] array, int n) {
//        int answer = 0;
//
//        int min = Integer.MAX_VALUE;
//        int index = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            int abs = Math.abs(array[i] - n);
//            if (min >= abs) {
//                min = abs;
//                index = i;
//            }
//        }
//
//        answer = array[index];
//
//        return answer;
//    }

    public int solution(int[] array, int n) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        List<Integer> tmp = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);
            tmp.add(abs);
            if (min >= abs) {
                min = abs;
                index = i;
            }
        }
        List<Integer> tmp2 = new ArrayList<>();

        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) == tmp.get(index)) {
                tmp2.add(array[i]);
            }
        }
        Collections.sort(tmp2);


        answer = tmp2.get(0);

        return answer;
    }
}
