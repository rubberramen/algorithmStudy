package programmers.lev0.day5;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac03 = new Prac03();
        int solution = prac03.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        System.out.println("solution = " + solution);
    }

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String ss1 : s1) {
            for (String ss2 : s2) {
                if (ss1.equals(ss2)) {
                    answer++;
                }
            }
        }

        return answer;
    }


}
