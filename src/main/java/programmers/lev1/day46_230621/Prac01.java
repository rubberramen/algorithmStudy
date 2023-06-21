package programmers.lev1.day46_230621;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* K번째수 : https://school.programmers.co.kr/learn/courses/30/lessons/42748 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});   // 3
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] array, int[][] commands) {

        List<Integer> tmp = new ArrayList<>();

        for (int[] command : commands) {

            List<Integer> list = new ArrayList<>();

            for (int i = (command[0] - 1); i <= (command[1] - 1); i++) {
                list.add(array[i]);
            }

            Collections.sort(list);
            tmp.add(list.get(command[2] - 1));
        }

        return tmp.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution_best(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
