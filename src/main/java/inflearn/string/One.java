package inflearn.string;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        One T = new One();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

    private int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }
}
