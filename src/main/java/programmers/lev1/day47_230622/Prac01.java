package programmers.lev1.day47_230622;


import java.util.*;

/* 가장 가까운 같은 글자 : https://school.programmers.co.kr/learn/courses/30/lessons/142086 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution("foobar");   // 3
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);

        String[] split = s.split("");
        for (int i = 1; i < split.length; i++) {
            boolean flag = false;
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                if (split[i].equals(split[j])) {
                    flag = true;
                    tmp = j;
                }
            }

            if (!flag) {
                list.add(-1);
            } else {
                int i1 = i - tmp;
                list.add(i1);
            }
        }

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

    public int[] solution_good1(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i);
        }
        return answer;
    }
}
