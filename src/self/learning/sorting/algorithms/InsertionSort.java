package self.learning.sorting.algorithms;

public class InsertionSort extends Sort {
    @Override
    public int[] sortIntArray(final int[] input) {
        final int size = input.length;
        for (int i = 1; i < size; ++i) {
            int key = input[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
             * to one position ahead of their current position */
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }

            input[j + 1] = key;
        }

        return input;
    }

    @Override
    public String algorithmName() {
        return getClass().getSimpleName();
    }
}
