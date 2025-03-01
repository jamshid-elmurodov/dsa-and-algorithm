public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int max = 0;

        char[] arr = s.toCharArray();

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != ' '){
                max++;
            } else {
                break;
            }
        }

        return max;
    }
}
