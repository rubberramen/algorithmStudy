package programmers.lev0.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] test = {3, 4, 5, 6, 1,3,5,6};

        int count = (int) Arrays.stream(test).filter(i -> i > 3).count();
        System.out.println("count = " + count);

        int[] ints = IntStream.of(4, 5).toArray();

    }
}
