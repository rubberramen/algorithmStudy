package inflearn.string;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        String4 s = new String4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        String[] answer = new String[n];

        for (int i = 0; i < array.length; i++) {
            String tmp = s.solution(array[i]);
            answer[i] = tmp;
        }

        for (String s1 : answer) {
            System.out.println(s1);
        }
    }

    private String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            answer += split[i];
        }
        return answer;
    }
}
