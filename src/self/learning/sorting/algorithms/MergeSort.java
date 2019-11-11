package self.learning.sorting.algorithms;

public class MergeSort extends Sort {
    @Override
    public int[] sortIntArray(final int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(final int[] input, final int left, final int right) {
        if (left >= right) return;

        final int middle = (left + right) / 2;

        mergeSort(input, left, middle);
        mergeSort(input, middle + 1, right);

        merge(input, left, middle, right);
    }

    private void merge(final int[] input, final int left, final int middle, final int right) {
        // Find sizes of two sub-arrays to be merged
        final int array1Size = middle - left + 1;
        final int array2Size = right - middle;

        /* Create temp arrays */
        final int[] array1 = new int[array1Size];
        final int[] array2 = new int[array2Size];

        /*Copy data to temp arrays*/
        System.arraycopy(input, left, array1, 0, array1Size);
        System.arraycopy(input, middle + 1, array2, 0, array2Size);

        /* Merge the temp arrays */
        mergeTwoSortedArray(array1, array2, array1Size, array2Size, left, input);
    }

    private void mergeTwoSortedArray(final int[] sortedArray1, final int[] sortedArray2,
                                     final int array1Size, final int array2Size, final int startingPosition,
                                     final int[] destinationSortedArray) {
        int array1Index = 0, array2Index = 0; // Initial indexes of sortedArray1 and sortedArray2
        int destinationArrayIndex = startingPosition; // Initial index of merged sub-array array

        while (array1Index < array1Size && array2Index < array2Size) {
            if (sortedArray1[array1Index] <= sortedArray2[array2Index])
                destinationSortedArray[destinationArrayIndex++] = sortedArray1[array1Index++];
            else destinationSortedArray[destinationArrayIndex++] = sortedArray2[array2Index++];
        }

        /* Copy remaining elements of sortedArray1[] if any */
        while (array1Index < array1Size) destinationSortedArray[destinationArrayIndex++] = sortedArray1[array1Index++];

        /* Copy remaining elements of sortedArray2[] if any */
        while (array2Index < array2Size) destinationSortedArray[destinationArrayIndex++] = sortedArray2[array2Index++];
    }

}
