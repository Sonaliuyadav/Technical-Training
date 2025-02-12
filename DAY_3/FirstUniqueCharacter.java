import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static char findFirstUniqueChar(String message) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : message.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String log = "support issue logged";
        char result = findFirstUniqueChar(log);
        System.out.println(result != '-' ? "First unique issue: " + result : "-1");
    }
}
