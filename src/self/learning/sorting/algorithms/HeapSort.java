package self.learning.sorting.algorithms;

public class HeapSort extends Sort {
    @Override
    public int[] sortIntArray(final int[] input) {
        final int size = input.length;

        /* Build heap (rearrange array) */
        for (int i = size / 2 - 1; i >= 0; i--) maxHeapify(input, size, i);

        /* One by one extract an element from heap */
        for (int i = size - 1; i >= 0; i--) {
            swap(input, 0, i);
            maxHeapify(input, i, 0); // call max heapify on the reduced heap
        }
        return input;
    }

    /* To heapify a subtree rooted with node nodeIndex which is an index in input[]. heapSize is size of heap */
    private void maxHeapify(final int[] input, final int heapSize, final int nodeIndex) {
        final int leftChild = getLeft(nodeIndex);
        final int rightChild = getRight(nodeIndex);

        int largest = nodeIndex; // Initialize largest as root

        /* If left child is larger than root */
        if (leftChild < heapSize && input[leftChild] > input[largest]) largest = leftChild;

        /* If right child is larger than largest so far */
        if (rightChild < heapSize && input[rightChild] > input[largest]) largest = rightChild;

        // If largest is not root
        if (largest != nodeIndex) {
            swap(input, nodeIndex, largest);

            // Recursively heapify the affected sub-tree
            maxHeapify(input, heapSize, largest);
        }
    }

    private int getRight(int nodeIndex) {
        return 2 * nodeIndex + 2;
    }

    private int getLeft(int nodeIndex) {
        return 2 * nodeIndex + 1;
    }
}
