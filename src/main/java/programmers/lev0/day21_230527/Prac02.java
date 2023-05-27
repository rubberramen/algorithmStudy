package programmers.lev0.day21_230527;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution("10", "11");
        System.out.println("answer = " + answer);
    }

    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int res = num1+num2;
        answer = Integer.toBinaryString(res);

        return answer;
    }

}
