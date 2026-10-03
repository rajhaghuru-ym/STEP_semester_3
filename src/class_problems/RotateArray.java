package class_problems;

public class RotateArray {
    public int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }

        k = k % nums.length;
        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int newPosition = (i + k) % nums.length;
            newArray[newPosition] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] result = solution.rotateArray(nums, 3);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}