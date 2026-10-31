package WEEK10;

public class ExamScoreBandCounter {

    private static int lowerBound(int[] scores, int target) {
        int low = 0;
        int high = scores.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (scores[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upperBound(int[] scores, int target) {
        int low = 0;
        int high = scores.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (scores[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int countInBand(int[] scores, int low, int high) {
        if (scores == null || scores.length == 0 || low > high) {
            return 0;
        }
        int start = lowerBound(scores, low);
        int end = upperBound(scores, high);
        return end - start;
    }

    public static void main(String[] args) {
        int[] scores = { 35, 42, 42, 50, 58, 58, 58, 63, 71, 88 };
        System.out.println(countInBand(scores, 42, 58)); // Expected Output: 6
        System.out.println(countInBand(scores, 90, 100)); // Expected Output: 0
    }
}
