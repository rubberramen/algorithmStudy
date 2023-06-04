package programmers.lev0.day29_230604;

import java.util.*;

/* 특이한 정렬 : https://school.programmers.co.kr/learn/courses/30/lessons/120880 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0)
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else
                order[i] = numlist[i] - n;
        }

        Arrays.sort(order); // 오름차순 정렬

        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];
            else answer[i] = (int)order[i] + n;
        }

        return answer;
    }


    public int[] solution_fail2(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        List<Integer> list = new ArrayList<>();

        for (int i : numlist) {
            int a = Math.abs(i - n);
            list.add(a);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < answer.length; i++) {
            map.put(numlist[i], list.get(i));
        }
        Collections.sort(list);

        for (Integer integer : map.keySet()) {

        }


        return answer;
    }

    public int[] solution_fali1(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        List<Integer> list = new ArrayList<>();

        for (int i : numlist) {
            int a = Math.abs(i - n);
            list.add(a);
        }

        Collections.sort(list);

        answer[0] = list.get(0) + n;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = list.get(i) + n;

            if (answer[i - 1] == answer[i]) {
                answer[i] = answer[i] - 2 * (answer[i] - 5);
            }

        }
        return answer;
    }

}
