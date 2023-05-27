package programmers.lev0.day11_230517;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> stream1 = Arrays.stream(arr, 1, 3);
        System.out.println("stream = " + stream.toString());
        System.out.println("stream1 = " + stream1);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = list.stream();
    }
}
