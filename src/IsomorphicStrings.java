import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < tArr.length; i++) {
            if (map.containsKey(tArr[i])){
                if (map.get(tArr[i]) != sArr[i]){
                    return false;
                }

                continue;
            } else if (map.containsValue(sArr[i])){
                return false;
            }

            map.put(tArr[i], sArr[i]);
        }

        return true;
    }
}
