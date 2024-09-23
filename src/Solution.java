import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution class
 */
public class Solution {

    /**
     * Method to place vendors
     *
     * @param positions
     * @param k
     * @param dist
     *
     * @return {@link boolean}
     */
    public static boolean placeVenors(List<Integer> positions, int k, int dist) {

        positions = new ArrayList<>(positions);

        // Sort the positions
        Collections.sort(positions);

        // Place first vendor on first available position
        int placeVendor = 1;

        // Last vendor
        int lastVendorPosition = positions.get(0);

        // Iterate through the positions
        for (int i = 1; i < positions.size(); i++) {
            int temp = positions.get(i) - lastVendorPosition;

            if(temp >= dist) {
                placeVendor++;
                lastVendorPosition = positions.get(i);

                // If we able to place all vendors
                if (placeVendor == k) {
                    return true;
                }
            }
        }

        // if we unable to place all vendors
        return placeVendor >= k;
    }
}
