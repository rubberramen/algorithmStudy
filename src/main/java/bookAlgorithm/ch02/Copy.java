package bookAlgorithm.ch02;

public class Copy {

    public void copy(int[] a, int[] b) {
        int num = (a.length <= b.length) ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public void rcopy(int[] a, int[] b) {
        int num = Math.min(a.length, b.length);

        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - 1 - i];
        }
    }
}
