import java.util.Arrays;

public class BubbleSortExamScores {
    public static void bubbleSort(int[] scores) {
        int n = scores.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {85, 78, 92, 67, 88, 76, 95};

        System.out.println("Original Scores: " + Arrays.toString(examScores));
        bubbleSort(examScores);
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}
