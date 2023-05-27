package programmers.lev0.day11_230517;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution2("1a2b3c4d123");
        System.out.println("answer = " + answer);

//        String str = "Hello, World!";
//        str.chars().forEach(System.out::println);


    }

    public int solution(String my_string) {
        int answer = 0;
        char[] chars = my_string.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1' || aChar == '2' || aChar == '3' || aChar == '4' || aChar == '5' || aChar == '6' || aChar == '7' || aChar == '8' || aChar == '9') {
                answer += Character.getNumericValue(aChar);
            }
        }
        return answer;
    }

    public int solution2(String my_string) {
        int answer = 0;

        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
//        IntStream chars = my_string.chars();
//        int[] ints = chars.toArray();
//
//        return answer;
    }

}
