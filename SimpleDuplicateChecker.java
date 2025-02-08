import java.util.HashSet;
import java.util.Set;

public class SimpleDuplicateChecker {

    static Set<String> registeredIds = new HashSet<>(); 

    public static boolean isIdDuplicate(String id) {
        if (registeredIds.contains(id)) { 
            return true;
        } else {
            registeredIds.add(id);
            return false;
        }
    }

    public static void main(String[] args) {
        String id1 = "STUDENT1";
        String id2 = "STUDENT2";
        String id3 = "STUDENT1"; 

        System.out.println(id1 + " is duplicate: " + isIdDuplicate(id1)); // Output: false
        System.out.println(id2 + " is duplicate: " + isIdDuplicate(id2)); // Output: false
        System.out.println(id3 + " is duplicate: " + isIdDuplicate(id3)); // Output: true
    }
}
