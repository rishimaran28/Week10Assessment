public class ClassAttendanceTracker {

    // Returns array: [total present days, longest unbroken run of present days]
    // Single pass solution
    // Time Complexity: O(n)
    // Space Complexity: O(1) auxiliary space
    public static int[] attendanceSummary(int[] days) {
        int presentCount = 0;
        int currentStreak = 0;
        int longestStreak = 0;

        for (int day : days) {
            if (day == 1) {
                presentCount++;
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        return new int[]{presentCount, longestStreak};
    }

    public static void main(String[] args) {
        // Sample 1
        int[] days1 = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] res1 = attendanceSummary(days1);
        System.out.println("Present: " + res1[0] + ", Longest streak: " + res1[1]);

        // Sample 2
        int[] days2 = {0, 0, 0};
        int[] res2 = attendanceSummary(days2);
        System.out.println("Present: " + res2[0] + ", Longest streak: " + res2[1]);
    }
}