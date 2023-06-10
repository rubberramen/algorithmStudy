package programmers.lev1.day35_230610;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 자연수 뒤집어 배열로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12932 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(12345);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(long n) {

        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        List<Integer> tmp = new ArrayList<>();

        while (n > 0) {
            int a = (int) (n % 10);
            tmp.add(a);
            n = n / 10;
        }

        for (int i = 0; i < s.length(); i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }

    public Integer[] solution1(long n) {

        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        List<Integer> tmp = new ArrayList<>();

        while (n > 0) {
            int a = (int) (n % 10);
            tmp.add(a);
            n = n / 10;
        }

        int size = tmp.size();
        Integer[] integers = tmp.toArray(new Integer[size]);

        return integers;
    }

    public int[] solutionGood(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }
}
