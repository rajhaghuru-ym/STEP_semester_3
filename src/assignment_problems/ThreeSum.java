package assignment_problems;

import java.util.Arrays;

public class ThreeSum {
    public int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        int[][] temp = new int[10000][3];
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    temp[count][0] = nums[i];
                    temp[count][1] = nums[j];
                    temp[count][2] = nums[k];
                    count = count + 1;

                    j = j + 1;
                    k = k - 1;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j = j + 1;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k = k - 1;
                    }
                } else if (sum < 0) {
                    j = j + 1;
                } else {
                    k = k - 1;
                }
            }
        }

        int[][] result = new int[count][3];
        for (int i = 0; i < count; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
            result[i][2] = temp[i][2];
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[][] result = solution.threeSum(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i][0] + ", " + result[i][1] + ", " + result[i][2] + "]");
        }
    }
}