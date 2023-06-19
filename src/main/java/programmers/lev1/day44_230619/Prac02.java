package programmers.lev1.day44_230619;


import java.util.Arrays;

/* 시저 암호 : https://school.programmers.co.kr/learn/courses/30/lessons/12926 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution("y", 10);   // 3
        System.out.println("answer = " + answer);
    }

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { //공백
                answer.append(ch);
                continue;
            }
            if (ch >= 'a' && ch <= 'z') { //소문자
                if (ch + n > 'z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            } else if (ch >= 'A' && ch <= 'Z') { //대문자
                if (ch + n > 'Z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            }
        }
        return answer.toString();
    }

    public String solution_fail(String s, int n) {
        String answer = "";

        char[] charArray = s.toCharArray();

        char[] test = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            char tmp;

            if (charArray[i] == ' ') {
                tmp = ' ';
            } else if (charArray[i] == 'Z') {
                tmp = 'A';
                tmp += (n - 1);
            } else if (charArray[i] == 'z') {
                tmp = 'a';
                tmp += (n - 1);
                String a = "";
            } else {
                tmp = (char) (charArray[i] + n);
            }

            test[i] = tmp;
        }

        for (char c : test) {
            answer += c;
        }

        return answer;
    }
}
