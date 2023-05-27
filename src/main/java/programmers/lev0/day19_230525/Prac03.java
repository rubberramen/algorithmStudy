package programmers.lev0.day19_230525;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int[] answer = prac01.solution(new int[]{3, 76, 24});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        List<Integer> a = new ArrayList<>();
        for (Integer integer : emergency) {
            a.add(integer);
        }
        reverseSort(emergency);

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (a.get(i) == emergency[j]) {
                    answer[i] = j + 1;
                }
            }
        }

        return answer;
    }

    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
