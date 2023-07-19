package inflearn.daily.sec3TwoPointers_SlidingWindow.day72_230720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PracExtra {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer token = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(token.nextToken());
//        int M = Integer.parseInt(token.nextToken());
//        token = new StringTokenizer(br.readLine());
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(token.nextToken());
//        }

        int N = 4;
        int M = 2;
        int[] arr = {1, 1, 1, 1};

//        System.out.println(N);
//        System.out.println(M);
//        System.out.println(Arrays.toString(arr));

//        int cnt = 0;
//        int start = 0;
//        int end = 0;
//
//        int sum = 0;
//        for (int i = start; i <= end; i++) {
//            sum += arr[i];
//        }
//
//        for (int i = 0;; i++) {
//            try {
//                if (sum == M) {
//                    cnt++;
//                    sum = sum + arr[++end] - arr[start++];
//                } else if (sum < M) {
//                    sum += arr[++end];
//                } else {
//                    sum -= arr[start];
//                    start++;
//                }
//
//            } catch (Exception e) {
//                break;
//            }
//        }
//        System.out.println(cnt);

        long sum = 0;
        int start = 0;
        int end = 0;
        long result = 0;
        while (start < N) {
            if (sum > M || end == N) {
                sum -= arr[start];
                start++;
            } else {
                sum += arr[end];
                end++;
            }
            if (sum == M)
                result++;
        }
        System.out.println(result);
    }
}
