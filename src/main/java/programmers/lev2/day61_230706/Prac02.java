package programmers.lev2.day61_230706;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* 영어 끝말잇기: https://school.programmers.co.kr/learn/courses/30/lessons/12981 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution1(3,
                new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});   // 1
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {   // 이전에 등장한 단어인경우
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]); // 현재 단어 리스트에 넣기

            // 이전 끝단어와 현재 첫단어가 다른경우 - 끝말잇기가 아닌경우
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                flag = false;
                break;
            }
        }
        if (flag) return new int[]{0, 0};
        return answer;
    }

    public int[] solution1(int n, String[] words) {

        int[] answer = {0, 0};

        char chEnd = words[0].charAt(words[0].length() - 1);
        char chStart;

        System.out.print(chEnd + " ");
        HashSet<String> log = new HashSet<>();
        log.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            chStart = words[i].charAt(0);
            log.add(words[i]);
            if (chEnd != chStart || log.size() != i + 1) {
                System.out.print(i + 1 + "!");
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            chEnd = words[i].charAt(words[i].length() - 1);
            System.out.print(chEnd + " ");
        }
        System.out.println();
        System.out.println("(" + answer[0] + ", " + answer[1] + ")");
        return answer;
    }

    public int[] solution_fail(int n, String[] words) {
        int[] answer = new int[2];

        for (int i = 0; i < words.length - 1; i++) {

            String a = words[i].substring(words[i].length() - 1);  // t
            String b = words[i + 1].substring(0, 1);

            if (!a.equals(b)) {
                answer[0] = ((i + 1) % n) + 1;    // i = 3
                answer[1] = ((i + 2) / n) + 1;
                break;
            }

            if (i == words.length - 2) {

                if (a.equals(b)) {
                    answer[0] = ((i + 1) % n) + 1;    // i = 3
                    answer[1] = ((i + 2) / n);
                } else {
                    answer[0] = 0;
                    answer[1] = 0;
                }
            }

        }
        return answer;
    }
}