package programmers.lev0.day14_230520;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution3(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] numbers, String direction) {

        if (direction.equals("right")) {
            int tmp = numbers[numbers.length - 1];
            for (int i = numbers.length - 2; i >= 0; i--) {
                numbers[i + 1] = numbers[i];
            }
            numbers[0] = tmp;
        } else {
            int tmp = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = tmp;
        }
        return numbers;
    }

    public int[] solution2(int[] numbers, String direction) {

        if (direction.equals("right")) {
            int tmp = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, numbers, 1, numbers.length - 2 + 1);
            numbers[0] = tmp;
        } else {
            int tmp = numbers[0];
            System.arraycopy(numbers, 1, numbers, 0, numbers.length - 1);
            numbers[numbers.length - 1] = tmp;
        }
        return numbers;
    }

    public int[] solution3(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
            String test = "";
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
