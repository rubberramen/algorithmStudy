package programmers.lev2.day60_230705;


import java.util.ArrayList;
import java.util.List;

/* 피보나치 수: https://school.programmers.co.kr/learn/courses/30/lessons/12945 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution(5);   // 2
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;
        int fibo = fibo(n);
//        answer = fibo % 1234567;
        return fibo;
    }

    public int fibo(int n) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        int tmp = 0;

        for (int i = 2; i <= n; i++) {
            tmp = list.get(i - 2) + list.get(i - 1);
            tmp = tmp % 1234567;
            list.add(tmp);
        }

        return tmp;
    }


    public int fibo_rutimeError(int n) {    // 런타임 에러.
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}