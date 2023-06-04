package programmers.lev0.day30_230605;

/* 다음에 올 숫자 : https://school.programmers.co.kr/learn/courses/30/lessons/120924 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(new int[]{2, 4, 8});  // 5   // [2, 4, 8] -> 16
        System.out.println("answer = " + answer);
    }

    public int solution(int[] common) {
        int answer = 0;

        if (common[2] - common[1] == common[1] - common[0]) {   // 등차 수열
            answer = common[common.length - 1] + common[1] - common[0];
        } else {    // 등비 수열.
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }

}
