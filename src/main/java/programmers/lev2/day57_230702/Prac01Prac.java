package programmers.lev2.day57_230702;


/* JadenCase 문자열 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12951 */
public class Prac01Prac {
    public static void main(String[] args) {
        Prac01Prac prac01 = new Prac01Prac();
        String answer = prac01.solution("3people unFollowed me ");   // 37
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        String answer = "";

        // " " 기준으로 문자열 잘라서 배열에 넣음
        String[] arr = s.split(" ");

        // 잘린 문자열을 순서대로 처리
        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];

            // 문자열의 길이가 0이라면(공백 이라면)
            // answer에 " "만 추가
            if (arr[i].length() == 0) {
                answer += " ";
            }
            // 문자가 있다면
            else {
                // 0번째 문자는 대문자로
                answer += now.substring(0, 1).toUpperCase();
                // 1번째 문자부터 마지막까지는 소문자로
                answer += now.substring(1, now.length()).toLowerCase();
                // 마지막에 " " 추가
                answer += " ";
            }
        }

        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        }

        // 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length() - 1);
    }


    public String solution_fail(String s) {
        String answer = "";

        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            if (Character.isDigit(s2.toCharArray()[0])) {
                answer += s2 + " ";
                continue;
            } else {
                String tmp = "";
                char c = Character.toUpperCase(s2.toCharArray()[0]);
                tmp += c;
                for (int i = 1; i < s2.length(); i++) {
                    char c1 = Character.toLowerCase(s2.toCharArray()[i]);
                    tmp += c1;
                }
                answer += tmp + " ";
            }
        }

        String zzz = "";
        char[] chars = answer.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            zzz += chars[i];
        }

        return zzz;
    }
}