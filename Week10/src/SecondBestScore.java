public class SecondBestScore {

    // Returns the second-highest distinct score, or -1 if it does not exist
    // Time Complexity: O(n) single pass (vs O(n log n) for sorting)
    // Space Complexity: O(1) auxiliary space (vs O(n) or O(log n) for sorting)
    public static int secondHighest(int[] scores) {
        int highest = -1;
        int second = -1;

        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score < highest && score > second) {
                second = score;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        // Sample 1
        int[] scores1 = {45, 78, 92, 78, 60};
        System.out.println(secondHighest(scores1)); // Expected: 78

        // Sample 2
        int[] scores2 = {50, 50, 50};
        System.out.println(secondHighest(scores2)); // Expected: -1
    }
}