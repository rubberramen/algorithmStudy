package inflearn;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        Test test = new Test();
        int sol = test.sol(input1, input2);

        System.out.println(sol);
    }

    public int sol(String str, String a) {
        str = str.toLowerCase();
        a = a.toLowerCase();

        String[] split = str.split("");
        int answer = 0;
        for (String s : split) {
            if (s.equals(a)) {
                answer++;
            }
        }
        return answer;
    }
}
