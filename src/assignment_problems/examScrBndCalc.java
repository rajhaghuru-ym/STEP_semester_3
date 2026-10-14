package assignment_problems;


class ExamScoreBandCounter {

    public static int countInBand(int[] scores, int low, int high) {
        int leftIndex = findFirstGreaterOrEqual(scores, low);
        int rightIndex = findFirstGreaterOrEqual(scores, high + 1);
        return rightIndex - leftIndex;
    }

    public static int findFirstGreaterOrEqual(int[] scores, int target) {
        int left = 0;
        int right = scores.length - 1;
        int result = scores.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (scores[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] scores1 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores1, 42, 58));

        int[] scores2 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores2, 90, 100));
    }
}
