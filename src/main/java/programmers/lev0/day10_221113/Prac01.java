package programmers.lev0.day10_221113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] solution = prac01.solution2(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println("solution = " + Arrays.toString(solution));

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Test1");
//        arrayList.add("Test2");
//        arrayList.add("Test3");
//
//        String[] array = arrayList.toArray(new String[arrayList.size()]);
//        System.out.println("array = " + Arrays.toString(array));
//
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(1);
//        arrayList2.add(2);
//        arrayList2.add(3);
//        int[] integers;
//        integers = (int[]) arrayList2.toArray(new Integer[arrayList2.size()]);


    }

    public int[] solution(int n, int[] numlist) {

        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution2(int n, int[] numlist) {

        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
