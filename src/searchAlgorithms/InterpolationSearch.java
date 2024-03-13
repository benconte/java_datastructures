package searchAlgorithms;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arrray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(arrray, 256);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        // while our value is within the new searchable area, keep searching
        while (value >= array[low] && value <= array[high] && low <= high){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}

/*
 * interpolation search = improvement over binary search best used for "uniformly" distributed data
 *                        "guesses" where a value might be based on calculated proble results
 *                        if probe is incorrect, search area is narrowed, and a new proble is calculated
 *
 *                        average case: O(log(log(n))
 *                        worst cae: O(n) [values increase exponentially]
 */