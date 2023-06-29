package programmers.lev1.day54_230629;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 실패율: https://school.programmers.co.kr/learn/courses/30/lessons/42889 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(4, new int[]{2, 1, 2, 6, 2, 4, 3, 3});   // "[3,4,2,1,5]"
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int N, int[] stages) {

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            double total = 0;
            double fail = 0;
            for (int j = 0; j < stages.length; j++) {
                if(i <= stages[j]) total++;
                if(i == stages[j]) fail++;
            }
            if(total == 0 && fail == 0) total = 1;
            map.put(i, fail/total);
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    rKey = key;
                }
            }
            answer[i] = rKey;
            map.remove(rKey);
        }

        return answer;
    }
}