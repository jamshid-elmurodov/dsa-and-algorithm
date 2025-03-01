public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int l = 0;
        int r = 0;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        while(r < arr2.length && l < arr1.length){
            if(arr1[l] == arr2[r]){
                l++;
            }

            r++;
        }

        return arr1.length == l;
    }
}
