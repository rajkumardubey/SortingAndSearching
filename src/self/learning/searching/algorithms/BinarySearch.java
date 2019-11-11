package self.learning.searching.algorithms;

public class BinarySearch extends Search {
    @Override
    public int search(final int[] input, final int keyToBeSearched) {
        return binarySearch(input, 0, input.length - 1, keyToBeSearched);
    }

    private int binarySearch(final int[] input,
                             final int left, final int right,
                             final int keyToBeSearched) {
        if (left > right) return -1;
        final int mid = left + (right - left) / 2;

        /* If the element is present at the middle itself */
        if (keyToBeSearched == input[mid]) return mid;

        /* If element is smaller than mid, then it can only be present in left sub-array */
        if (keyToBeSearched < input[mid])
            return binarySearch(input, left, mid - 1, keyToBeSearched);

        /* Else the element can only be present in right sub-array */
        return binarySearch(input, mid + 1, right, keyToBeSearched);
    }
}