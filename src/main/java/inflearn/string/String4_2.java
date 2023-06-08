package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4_2 {
    public static void main(String[] args) {
        String4_2 s = new String4_2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        for (String str : s.solution1(n, array)) {
            System.out.println(str);
        }
    }

    private List<String> solution(int n, String[] array) {
        List<String> answer = new ArrayList<>();

        for (String s : array) {
            char[] chars = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;

            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        return answer;
    }

    private List<String> solution1(int n, String[] array) {
        List<String> answer = new ArrayList<>();

        for (String s : array) {
            String aaa = "";
            String[] split = s.split("");
            for (int i = 0; i < split.length / 2; i++) {
                String tmp = split[i];
                split[i] = split[split.length - 1 - i];
                split[split.length - 1 - i] = tmp;
            }

            for (String s1 : split) {
                aaa += s1;
            }

            answer.add(aaa);
        }
        return answer;
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }


}
