import java.util.Map;
import java.util.TreeMap;

public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] ints : nums1) {
            map.put(ints[0], ints[1]);
        }

        for (int[] ints : nums2) {
            Integer i = map.getOrDefault(ints[0], 0);

            map.put(ints[0], i + ints[1]);
        }

        int[][] res = new int[map.size()][2];
        int l = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[l++] = new int[]{entry.getKey(), entry.getValue()};
        }

        return res;
    }
}
