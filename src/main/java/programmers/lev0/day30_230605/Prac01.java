package programmers.lev0.day30_230605;

import java.util.*;

/* 최빈값 구하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120812 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[]{1, 3, 3, 3, 6});
        System.out.println("answer = " + answer);
    }

    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }


    public int solution1(int[] array) {
        int answer = array[0];
        int max = 0;
        int frequent[] = new int[1000];

        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }

        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == frequent[j]) temp++;
            if(temp > 1) answer = -1;
        }

        return answer;
    }

    public int solution_fail1(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int[] rank = new int[array.length];

        int n = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                n++;
                rank[i] = n;
            } else {
                n = 1;
                rank[i] = n;
            }

        }

        return answer;
    }

}
