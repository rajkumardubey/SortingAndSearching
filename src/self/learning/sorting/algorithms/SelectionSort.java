package self.learning.sorting.algorithms;

public class SelectionSort extends Sort {
    @Override
    public int[] sortIntArray(final int[] input) {
        final int size = input.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++)
                if (input[j] < input[minIndex]) minIndex = j;

            swap(input, minIndex, i);
        }
        return input;
    }
}
