import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> sortedList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : sortedList) {
            if (uniqueList.isEmpty() || uniqueList.get(uniqueList.size() - 1) != num) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> sortedList = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5);
        System.out.println("Original List: " + sortedList);

        List<Integer> uniqueList = removeDuplicates(sortedList);
        System.out.println("List After Removing Duplicates: " + uniqueList);
    }
}
