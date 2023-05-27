package programmers.lev0.day5;

public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac03 = new Prac04();
        String solution = prac03.solution("BCBdbe", "B");
        System.out.println("solution = " + solution);
    }

    public String solution(String my_string, String letter) {
        String answer = "";
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = 0; i < my_string.length(); i++) {
//
//            if (my_string.charAt(i) != letter.charAt(0)) {
//                sb.append(my_string.charAt(i));
//            }
//        }
//        answer = sb.toString();


        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }


}
