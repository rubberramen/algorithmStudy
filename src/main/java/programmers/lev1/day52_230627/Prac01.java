package programmers.lev1.day52_230627;


import java.util.*;

/* 모의고사: https://school.programmers.co.kr/learn/courses/30/lessons/42840 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution1(new int[]{1, 2, 3, 4, 5});   // 2
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answerA = 0;
        int answerB = 0;
        int answerC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                answerA++;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == b[i % 8]) {
                answerB++;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == c[i % 10]) {
                answerC++;
            }
        }

        int max1 = Math.max(answerA, answerB);
        int max = Math.max(max1, answerC);

        List<Integer> list = new ArrayList<>();

        if (answerA == max) {
            list.add(1);
        }

        if (answerB == max) {
            list.add(2);
        }

        if (answerC == max) {
            list.add(3);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }

    public int[] solution1(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answerA = 0;
        int answerB = 0;
        int answerC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                answerA++;
            }

            if (answers[i] == b[i % 8]) {
                answerB++;
            }

            if (answers[i] == c[i % 10]) {
                answerC++;
            }
        }

        int max = Math.max(Math.max(answerA, answerB), answerC);

        List<Integer> list = new ArrayList<>();

        if (answerA == max) list.add(1);
        if (answerB == max) list.add(2);
        if (answerC == max) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}