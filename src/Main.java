import java.util.List;

/**
 * Main class
 */
public class Main {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Test case 1
        System.out.println(Solution.placeVenors(List.of(1, 4, 2, 8, 9), 3, 3)); // true

        // Test case 2
        System.out.println(Solution.placeVenors(List.of(1, 4, 2, 8, 9), 4, 3)); // false
    }
}