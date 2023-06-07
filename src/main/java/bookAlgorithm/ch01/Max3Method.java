package bookAlgorithm.ch01;

public class Max3Method {

    static int max3(int a, int b, int c) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }

    public static void main(String[] args) {
        int max = max3(5, 16, 7);
        System.out.println("max = " + max);
    }
}
