package assignment_problems;

import java.util.HashMap;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySum solution = new SubarraySum();
        int[] nums = {1, 1, 1};
        System.out.println(solution.subarraySum(nums, 2));
    }
}