package programmers.lev0.day23_230529;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        long answer = prac01.solution("onetwothreefourfivesixseveneightnine");
        System.out.println("answer = " + answer);
    }

    public long solution(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");

        answer = Long.parseLong(numbers);

        return answer;
    }

    public long solution1(String numbers) {
        long answer = 0;

        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }

}
