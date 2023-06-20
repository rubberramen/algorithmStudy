package programmers.lev1.day45_230620;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 숫자 문자열과 영단어 : https://school.programmers.co.kr/learn/courses/30/lessons/81301 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        String[] answer = prac01.solution2(new String[]{"sun", "bed", "car"}, 1);   // 1478
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);
        answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).substring(n, n+1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }

        return answer;
    }

}
