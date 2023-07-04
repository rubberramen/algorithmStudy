package programmers.lev2.day59_230704;


import java.util.*;

/* 이진 변환 반복하기: https://school.programmers.co.kr/learn/courses/30/lessons/70129 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution("110010101001");   // [3, 8]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String s) {

        int[] answer = new int[2];

        int count = 0;
        int count_zero = 0;

        while (!s.equals("1")) {
            int count_one = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count_one++;
                } else {
                    count_zero++;
                }
            }
            s = Integer.toBinaryString(count_one);
            count++;
        }

        answer[0] = count;
        answer[1] = count_zero;

        return answer;
    }

    public int[] solution_fail(String s) {      // 런타임 에러

        int tmp1 = 0;   // 제거한 0개수.
        int tmp2 = 0;

        String[] split = s.split("");
        List<String> list = new ArrayList<>(Arrays.asList(split));
        List<String> list1 = new ArrayList<>(list);

        while (list.size() != 1) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals("0")) {
                    tmp1++;
                    list1.remove("0");
                    String test = "";
                }
            }

            tmp2++;
            int size = list1.size();
            String binaryString = Integer.toBinaryString(size);
            String[] split1 = binaryString.split("");
            list = new ArrayList<>(Arrays.asList(split1));
            list1 = new ArrayList<>(Arrays.asList(split1));
        }
        int[] answer = new int[2];
        answer[0] = tmp2;
        answer[1] = tmp1;
        return answer;
    }
}