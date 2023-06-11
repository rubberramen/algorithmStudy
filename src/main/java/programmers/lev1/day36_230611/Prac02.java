package programmers.lev1.day36_230611;


/* 자연수 뒤집어 배열로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12932 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution("-1234");
        System.out.println("answer = " + answer);
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
