package programmers.lev0.day4;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int solution = prac01.solution("ppprrrogrammers", "pppp");
        System.out.println("solution = " + solution);


    }

    public int solution(String str1, String str2) {
        int answer = 0;

        for (int i = 0; i < str1.length() - str2.length()+1; i++) {
            if (str1.substring(i, i + str2.length()).equals(str2)) {
                return 1;
            }
        }

        return 2;
    }
}
