package programmers.lev0.day20_230526;

import java.util.ArrayList;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution1(1, 13, 1);
        System.out.println("answer = " + answer);
    }

    public int solution(int i, int j, int k) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int l = i; l <= j; l++) {
            list.add(l);
        }

        for (Integer integer : list) {
            int test = integer;
            while (test / 10 >= 0) {
                if (test % 10 == k) {
                    answer++;
                }
                test /= 10;

                if (test == 0) {
                    break;
                }
            }
        }
        return answer;
    }

    public int solution1(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            int test = l;
            while (test / 10 >= 0) {
                if (test % 10 == k) {
                    answer++;
                }
                test /= 10;

                if (test == 0) {
                    break;
                }
            }
        }
        return answer;
    }

    public int solution2(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            int test = l;
            while (test != 0) {
                if (test % 10 == k) {
                    answer++;
                }
                test /= 10;
            }
        }
        return answer;
    }

}
