package self.learning.sorting.algorithms;

public class QuickSort extends Sort {
    @Override
    public int[] sortIntArray(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(final int[] input, final int low, final int high) {
        if (low >= high) return;

        /* pi is partitioning index, input[pi] is now at right place */
        final int pi = partition(input, low, high);

        /* Recursively sort elements before partition and after partition */
        quickSort(input, low, pi - 1);
        quickSort(input, pi + 1, high);
    }

    /*
     * This function takes last element as pivot,
     * places the pivot element at its correct position in sorted array,
     * and places all smaller (smaller than pivot) to left of pivot
     * and all greater elements to right of pivot
     */
    private int partition(final int[] input, final int low, final int high) {
        final int pivot = input[high];
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            /* If current element is smaller than the pivot */
            if (input[j] < pivot) swap(input, ++i, j);
        }

        swap(input, i + 1, high);

        return i + 1;
    }
}
