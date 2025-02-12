import java.util.HashMap;

public class FirstUniqueCharacterRecursive {
    public static char findFirstUniqueChar(String message, int index, HashMap<Character, Integer> charCount) {
        if (index == message.length()) {
            for (char ch : message.toCharArray()) {
                if (charCount.get(ch) == 1) {
                    return ch;
                }
            }
            return '-';
        }

        char currentChar = message.charAt(index);
        charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

        return findFirstUniqueChar(message, index + 1, charCount);
    }

    public static void main(String[] args) {
        String log = "support issue logged";
        char result = findFirstUniqueChar(log, 0, new HashMap<>());
        System.out.println(result != '-' ? "First unique issue: " + result : "-1");
    }
}
