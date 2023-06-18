package programmers.lev1.day43_230618;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 같은 숫자는 싫어 : https://school.programmers.co.kr/learn/courses/30/lessons/12906 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[]{1,1,3,3,0,1,1});   // [1,3,0,1]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
