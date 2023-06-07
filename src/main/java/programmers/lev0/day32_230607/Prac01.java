package programmers.lev0.day32_230607;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 옹알이(1) : https://school.programmers.co.kr/learn/courses/30/lessons/120956 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println("answer = " + answer);
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            babbling[i] = babbling[i].replace("0", "");

            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }

    public int solution_fail(String[] babbling) {
        int answer = 0;
        String[] able = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

            for (String s1 : able) {
                List<String> list1 = new ArrayList<>(Arrays.asList(s1.split("")));

                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < list1.size(); j++) {
                        if (list.get(i).equals(list1.get(j))) {  // why???
                            list.remove(i);
                        }
                    }
                }
                if (list.isEmpty()) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
