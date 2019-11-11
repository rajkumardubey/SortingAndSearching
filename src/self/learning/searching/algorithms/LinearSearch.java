package self.learning.searching.algorithms;

public class LinearSearch extends Search {
    @Override
    public int search(final int[] input, final int keyToBeSearched) {
        for (int index = 0; index < input.length; index++) {
            if (keyToBeSearched == input[index]) return index;
        }

        return -1;
    }
}
