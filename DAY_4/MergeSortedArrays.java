import java.util.Stack;

public class MergeSortedArrays {
    public static Stack<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        Stack<Integer> stack = new Stack<>();
        int i = arr1.length - 1, j = arr2.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                stack.push(arr1[i--]);
            } else {
                stack.push(arr2[j--]);
            }
        }

        while (i >= 0) {
            stack.push(arr1[i--]);
        }

        while (j >= 0) {
            stack.push(arr2[j--]);
        }

        return stack;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        Stack<Integer> mergedStack = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Stack: " + mergedStack);
    }
}
