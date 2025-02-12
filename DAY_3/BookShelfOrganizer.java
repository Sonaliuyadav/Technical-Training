import java.util.Arrays;

public class BookShelfOrganizer {
    public static void selectionSort(String[] books) {
        int n = books.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (books[j].compareTo(books[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = books[i];
            books[i] = books[minIndex];
            books[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String[] bookTitles = {"The Alchemist", "Harry Potter", "Inferno", "A Brief History of Time", "Moby Dick"};

        System.out.println("Original Order: " + Arrays.toString(bookTitles));
        selectionSort(bookTitles);
        System.out.println("Sorted Order: " + Arrays.toString(bookTitles));
    }
}
