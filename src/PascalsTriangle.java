import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> response = new ArrayList<>();

        // birinchi row qo'shildi
        response.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            List<Integer> prev = response.get(response.size() - 1);

            newRow.add(1);

            for (int j = 1; j < i; j++) {
                newRow.add(prev.get(i - j) + prev.get(i - j - 1));
            }

            newRow.add(1);
            response.add(newRow);
        }

        return response;
    }
}
