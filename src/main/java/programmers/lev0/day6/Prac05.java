package programmers.lev0.day6;

import java.util.ArrayList;
import java.util.List;

public class Prac05 {
    public static void main(String[] args) {
        Prac05 prac01 = new Prac05();
        int solution = prac01.solution(20);
        System.out.println("solution = " + solution);

//        int i = 2;
//        double pow = Math.pow(2, 3);
//        System.out.println("pow = " + pow);
    }

    public int solution(int n) {
        int answer = 0;

//        for (int i = 1; i < n + 1; i++) {
//            for (int j = n; j > 0  ; j--) {
//                if (i * j == n) {
//                    answer++;
//                }
//            }
//        }
//        return answer;
        List<Integer> test = test(n);
//        if (test.size() % 2 == 0) {
//            answer = test.size();
//        } else {
//            answer = test.size() - 1;
//        }
        answer = test.size();
        return answer;
    }

    public List<Integer> test(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }


}
