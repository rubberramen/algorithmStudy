package programmers.lev1.day53_230628;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 카드 뭉치: https://school.programmers.co.kr/learn/courses/30/lessons/159994 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution(new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"});   // "Yes"
        System.out.println("answer = " + answer);
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        List<String> cardList1 = Arrays.asList(cards1);
        List<String> cardList2 = Arrays.asList(cards2);

        boolean flag = false;

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cardList1.get(0))) {

            } else {

            }
        }


        return answer;
    }

    public String solution_fail(String[] cards1, String[] cards2, String[] goal) {
//        String answer = "";

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < goal.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < cards1.length; j++) {
                    if (cards1[j].equals(goal[i])) {
                        flag1 = true;
                        break;
                    }
                }
                if (!flag1) return "No";
                flag1 = false;
            } else {
                for (int j = 0; j < cards2.length; j++) {
                    if (cards2[j].equals(goal[i])) {
                        flag2 = true;
                        break;
                    }
                }
                if (!flag2) return "No";
                flag2 = false;
            }
        }

//        if (flag1 && flag2) return "Yes";
//        else return "No";
        return "Yes";

    }
}