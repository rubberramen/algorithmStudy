package programmers.lev1.day43_230618;


/* 3진법 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/68935 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(45);   // [1,3,0,1]
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {

        String s = Integer.toString(n, 3);
        char[] chars = s.toCharArray();
        String tmp = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            tmp += chars[i];
        }

        return Integer.parseInt(tmp, 3);
    }

}
