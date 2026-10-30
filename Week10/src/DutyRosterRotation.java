import java.util.Arrays;

public class DutyRosterRotation {

    // Rotates the roster to the right by k places
    // Time Complexity: O(n)
    // Space Complexity: O(n) for the rotated array
    public static String[] rotateRoster(String[] names, long k) {
        int n = names.length;
        if (n == 0) {
            return names;
        }

        int shift = (int) (k % n);
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = names[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample 1
        String[] names1 = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names1, 2))); // Expected: [D, E, A, B, C]

        // Sample 2
        String[] names2 = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names2, 7))); // Expected: [D, E, A, B, C]
    }
}