package self.learning.sorting;

import self.learning.sorting.algorithms.Sort;

import java.util.Arrays;

class SortingTestRunner {
    private static final int TEST_DATA_SIZE = 5;
    private static final int[][] input = {{5, 1, 0, 4, 2, 9, 7, 3},
            {-5, -1, 0, -4, -2, -9, -7, -3},
            {-5, -1, 0, 4, -2, -9, 7, 3},
            {2, 7, 1, 2, 4, 3, 4},
            {}};

    private static final int[][] output = {{0, 1, 2, 3, 4, 5, 7, 9},
            {-9, -7, -5, -4, -3, -2, -1, 0},
            {-9, -5, -2, -1, 0, 3, 4, 7},
            {1, 2, 2, 3, 4, 4, 7},
            {}};

    static boolean runTestOnSortingAlgorithm(final Sort sort) {
        boolean result = true;
        for (int row = 0; row < TEST_DATA_SIZE; row++) {
            final int[] inputArray = input[row];
            System.out.println("Input : " + Arrays.toString(inputArray));

            final int[] expectedOutput = output[row];
            System.out.println("Expected Output : " + Arrays.toString(expectedOutput));

            final int[] actualOutput = sort.sortIntArray(inputArray);
            System.out.println("Actual Output : " + Arrays.toString(actualOutput));

            result &= Arrays.equals(actualOutput, expectedOutput);
            System.out.println();
        }
        return result;
    }
}
