package programmers.lev0.day26_230601;

/* 로그인 성공? : https://school.programmers.co.kr/learn/courses/30/lessons/120883 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});
        System.out.println("answer = " + answer);
    }

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else answer = "fail";
        }

        return answer;
    }

    /* 갈끔 버전 */
    public String solution1(String[] id_pw, String[][] db) {

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
