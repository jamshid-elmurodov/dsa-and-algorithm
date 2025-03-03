import java.util.HashSet;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String s : emails) {
            set.add(clear(s));
        }

        return set.size();
    }

    private String clear(String s) {
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '@'){
                sb.append(s.substring(i));
                break;
            }

            if (arr[i] == '+'){
                sb.append(s.substring(s.indexOf("@")));
                break;
            }

            if (arr[i] != '.'){
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
