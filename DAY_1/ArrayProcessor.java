public class ArrayProcessor {

    public static void processArray(int[] arr) {
       
        int maxElement = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum element: " + maxElement);

        
        int remainingIndices = arr.length - 1 - maxIndex;

       
        if (remainingIndices == 1) {
            System.out.println("Debit 1");
        } else if (remainingIndices == 2) {
            System.out.println("Debit 2");
        } else if (remainingIndices == 3) {
            System.out.println("+100");
        } else if (remainingIndices > 3) {
            System.out.println("+500");
        }
    }

    public static void main(String[] args) {
   
        int[] myArray = {5, 2, 9, 1, 5, 6, 3, 8, 7};

        processArray(myArray);
    }
}
