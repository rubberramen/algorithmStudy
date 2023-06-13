package programmers.lev1.day38_230613;


/* 음양 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/76501 */
public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int answer = prac01.solution(new int[]{1, 2, 3}, new boolean[]{false,false,true});   // "김서방은 1에 있다"
        System.out.println("answer = " + answer);
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
