package programmers.lev0.day16_230522;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution2(123456, 7);
        System.out.println("answer = " + answer);
    }

    public int solution(int num, int k) {
        int answer = -1;
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            int a = num % 10;
            list.add(a);
            num = num / 10;
        }
        Collections.reverse(list);
//        System.out.println("list = " + list);

        for (int i = list.size() -1; i >= 0; i--) {
            if (list.get(i) == k) {
                answer = i + 1;
            }
        }

        return answer;
    }

    public int solution1(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }

    public int solution2(int num, int k) {
        String s = String.valueOf(num);
        s = "-" + s;
        int i = s.indexOf(String.valueOf(k));
        return i;
    }

}
