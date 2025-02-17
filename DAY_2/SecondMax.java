public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println("Second maximum: " + max2);
    }
}