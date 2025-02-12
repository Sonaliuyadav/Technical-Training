public class SpyDecoder {
    public static String decodeMessage(String encoded) {
        return new StringBuilder(encoded).reverse().toString();
    }

    public static void main(String[] args) {
        String secretMessage = "edoc a etirw";
        System.out.println("Decoded message: " + decodeMessage(secretMessage));
    }
}
