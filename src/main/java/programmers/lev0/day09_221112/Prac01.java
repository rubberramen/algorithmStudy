package programmers.lev0.day09_221112;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String solution = prac01.solution2("205");
        System.out.println("solution = " + solution);


    }

    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {
            String kkk = rsp.substring(i, i+1);
            if (kkk.equals("2")) {
                answer += "0";
            } else if (kkk.equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }

    public String solution2(String rsp) {
        String answer = "";
        String[] split = rsp.split("");
        for (String s : split) {
            switch (s) {
                case "2":
                    answer += 0;
                    break;
                case "0":
                    answer += 5;
                    break;
                case "5":
                    answer += 2;
                    break;
            }
        }
        return answer;
    }
}
