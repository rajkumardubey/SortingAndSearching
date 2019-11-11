package self.learning.sorting.algorithms;

public class BubbleSort extends Sort {
    public int[] sortIntArray(final int[] input) {
        final int lastElementIndex = input.length - 1;
        int i, j;
        boolean swapped;

        for (i = 0; i < lastElementIndex; i++) {
            swapped = false;
            for (j = 0; j < lastElementIndex - i; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break; // IF no two elements were swapped by inner loop, then break
        }

        return input;
    }
}
