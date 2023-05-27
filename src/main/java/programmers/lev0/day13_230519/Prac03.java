package programmers.lev0.day13_230519;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        String answer = prac01.solution2(23);
        System.out.println("answer = " + answer);
    }

    public String solution(int age) {
        String answer = "";

//        Integer integer = Integer.valueOf(age);
        String s = String.valueOf(age);
        String[] split = s.split("");
        char[] c = new char[split.length];
        for (int i = 0; i < c.length; i++) {
            switch (split[i]) {
                case "0" :
                    c[i] = 'a';
                    break;
                case "1" :
                    c[i] = 'b';
                    break;
                case "2" :
                    c[i] = 'c';
                    break;
                case "3" :
                    c[i] = 'd';
                    break;
                case "4" :
                    c[i] = 'e';
                    break;
                case "5" :
                    c[i] = 'f';
                    break;
                case "6" :
                    c[i] = 'g';
                    break;
                case "7" :
                    c[i] = 'h';
                    break;
                case "8" :
                    c[i] = 'i';
                    break;
                case "9" :
                    c[i] = 'j';
                    break;
            }
        }

        for (int i = 0; i < c.length; i++) {
            answer += c[i];
        }

        return answer;
    }

    public String solution2(int age) {
        StringBuilder sb = new StringBuilder();

        int a = 'a';

        while(age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }

}
