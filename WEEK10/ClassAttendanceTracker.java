package WEEK10;

public class ClassAttendanceTracker {

    public static void attendanceSummary(int[] days) {
        if (days == null || days.length == 0) {
            System.out.println("Present: 0, Longest streak: 0");
            return;
        }

        int totalPresent = 0;
        int currentStreak = 0;
        int maxStreak = 0;

        for (int day : days) {
            if (day == 1) {
                totalPresent++;
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Present: " + totalPresent + ", Longest streak: " + maxStreak);
    }

    public static void main(String[] args) {
        int[] days1 = { 1, 1, 0, 1, 1, 1, 0, 1 };
        attendanceSummary(days1);
        int[] days2 = { 0, 0, 0 };
        attendanceSummary(days2);
    }
}
