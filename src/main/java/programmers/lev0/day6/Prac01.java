package programmers.lev0.day6;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String solution = prac01.solution("hello", 3);
        System.out.println("solution = " + solution);

//        String my_string = "hello";
//        String answer = "";
//        answer += my_string.charAt(0);
//        answer += my_string.charAt(1);
//        System.out.println("answer = " + answer);
//        answer += my_string.charAt(0) * 3;
//        System.out.println("answer = " + answer);
    }

    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }


}
