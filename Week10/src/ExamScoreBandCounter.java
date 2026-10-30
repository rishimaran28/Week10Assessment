public class ExamScoreBandCounter {

    // Finds the first position where element is >= target (lower bound)
    public static int lowerBound(int[] scores, int target) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Finds the first position where element is > target (upper bound)
    public static int upperBound(int[] scores, int target) {
        int left = 0;
        int right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Returns the count of scores in range [low, high] inclusive
    // Time Complexity: O(log n) using binary search (modified bounds)
    // Space Complexity: O(1) auxiliary space
    public static int countInBand(int[] scores, int low, int high) {
        int firstGteLow = lowerBound(scores, low);
        int firstGtHigh = upperBound(scores, high);
        return firstGtHigh - firstGteLow;
    }

    public static void main(String[] args) {
        // Sample 1
        int[] scores1 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores1, 42, 58)); // Expected: 6

        // Sample 2
        int[] scores2 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores2, 90, 100)); // Expected: 0
    }
}