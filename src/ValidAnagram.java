import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(
                counter(s),
                counter(t)
        );
    }

    int[] counter(String str){
        int[] res = new int[26];

        char[] arr = str.toCharArray();

        for(char c : arr){
            res[c - 97]++;
        }

        return res;
    }
}
