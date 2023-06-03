package programmers.lev0.day28_230603;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 유한소수 판별하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120878 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(12, 21);
        System.out.println("answer = " + answer);
    }

    public int solution(int a, int b) {
        int answer = 0;

        int gcp = gcp(a, b);
        int c = b / gcp;

        List<Integer> list = new ArrayList<>();
        // 소인수 구하기
        for (int i = 2; i <= c; i++) {
            while (c % i == 0) {
                list.add(i);
                c /= i;
            }
        }

        // 소인수 Set
        Set<Integer> set = new HashSet<>(list);

        boolean flag = true;
        for (Integer integer : set) {
            if (integer != 2 && integer != 5) {
                flag = false;
                break;
            }
        }

        if (flag) return 1;
        else return 2;
    }

    public int gcp(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcp(b, a % b);
        }
    }

    public int gcp2(int a, int b) {
        int min = Math.min(a, b);
        int gcp = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcp = i;
            }
        }
        return gcp;
    }

}
