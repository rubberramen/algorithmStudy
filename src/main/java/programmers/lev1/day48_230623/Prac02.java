package programmers.lev1.day48_230623;


/* 2016년 : https://school.programmers.co.kr/learn/courses/30/lessons/12901 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution(5, 24);   // "TUE"
        System.out.println("answer = " + answer);
    }

    // 2016년 1월 1일 : 금요일.
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int allDate = 0;

        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
}
