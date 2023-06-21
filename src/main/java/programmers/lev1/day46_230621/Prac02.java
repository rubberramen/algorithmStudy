package programmers.lev1.day46_230621;


import java.util.*;

/* 두 개 뽑아서 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/68644 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[]{2,1,3,4,1});   // [2,3,4,5,6,7]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        return array;
    }
}
