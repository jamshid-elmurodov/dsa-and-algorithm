public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int ind = 0;

        char[] str = strs[0].toCharArray();

        for (char c : str) {
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(c + "", ind)){
                    return strs[0].substring(0, ind + 1);
                }
            }
            ind++;
        }

        return strs[0];
    }
}
