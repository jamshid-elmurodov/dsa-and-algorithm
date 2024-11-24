package sorting;

import java.util.Arrays;

public class CountingSort {
    public static int[] sort(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int size = max - min + 1;

        int[] count = new int[size];

        for (int i : arr) {
            count[i - min]++;
        }

        int[] res = new int[arr.length];
        int pos = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0){
                res[pos++] = i + min;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 7, 4, 3, 5, 4, 7, 6};

        System.out.println(Arrays.toString(sort(arr)));
        // [2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7]

        // time O(n + k)
        // space O(n + k)
    }
}
