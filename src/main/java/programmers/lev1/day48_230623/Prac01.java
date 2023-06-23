package programmers.lev1.day48_230623;


import java.util.*;

/* 추억 점수 : https://school.programmers.co.kr/learn/courses/30/lessons/176963 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(new String[]{"kali", "mari", "don"},
                new int[]{11, 1, 55},
                new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}});   // 3
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < photo.length; i++) {
            int tmp = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String s = photo[i][j];

                for (int k = 0; k < name.length; k++) {
                    if (s.equals(name[k])) tmp += yearning[k];
                }
            }
            list.add(tmp);
        }

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
