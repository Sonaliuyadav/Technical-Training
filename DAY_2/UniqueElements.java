import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Unique elements: " + set);
    }
}